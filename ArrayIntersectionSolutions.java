import java.util.*;

public class ArrayIntersectionSolutions {
    
    // User's original solution (with minor fixes)
    public List<Integer> intersection2(int[][] nums) {
        int len = nums.length;
        List<Integer> res = new ArrayList<>();
        
        Arrays.sort(nums[0]);
        int i = 0;
        boolean isContain = false;
        
        while(i < nums[0].length) {
            isContain = false;
            for(int j = 1; j < nums.length; j++) {
                Arrays.sort(nums[j]); // This is inefficient - sorting multiple times
                for(int k = 0; k < nums[j].length; k++) {
                    if(nums[0][i] == nums[j][k]) {
                        isContain = true;
                        break;
                    }
                    else if(nums[0][i] < nums[j][k]) break;
                }
                if(!isContain) break;
            }
            if(isContain) res.add(nums[0][i]);
            i++;
        }
        return res;
    }
    
    // Optimized Solution 1: Using HashSet intersection
    public List<Integer> intersectionOptimized1(int[][] nums) {
        if (nums.length == 0) return new ArrayList<>();
        
        // Start with first array as a set
        Set<Integer> result = new HashSet<>();
        for (int num : nums[0]) {
            result.add(num);
        }
        
        // Intersect with each subsequent array
        for (int i = 1; i < nums.length; i++) {
            Set<Integer> currentSet = new HashSet<>();
            for (int num : nums[i]) {
                currentSet.add(num);
            }
            result.retainAll(currentSet); // This is where retainAll() is useful!
        }
        
        // Convert to sorted list
        List<Integer> sortedResult = new ArrayList<>(result);
        Collections.sort(sortedResult);
        return sortedResult;
    }
    
    // Optimized Solution 2: Sort once, then use binary search
    public List<Integer> intersectionOptimized2(int[][] nums) {
        if (nums.length == 0) return new ArrayList<>();
        
        // Sort all arrays once
        for (int[] array : nums) {
            Arrays.sort(array);
        }
        
        List<Integer> result = new ArrayList<>();
        
        // Check each element in first array
        for (int candidate : nums[0]) {
            boolean foundInAll = true;
            
            // Check if this candidate exists in all other arrays
            for (int i = 1; i < nums.length; i++) {
                if (Arrays.binarySearch(nums[i], candidate) < 0) {
                    foundInAll = false;
                    break;
                }
            }
            
            if (foundInAll) {
                result.add(candidate);
            }
        }
        
        return result; // Already sorted since nums[0] is sorted
    }
    
    // Optimized Solution 3: Frequency counting approach
    public List<Integer> intersectionOptimized3(int[][] nums) {
        if (nums.length == 0) return new ArrayList<>();
        
        Map<Integer, Integer> frequency = new HashMap<>();
        
        // Count frequency of each number across all arrays
        for (int[] array : nums) {
            Set<Integer> seen = new HashSet<>(); // To avoid counting duplicates within same array
            for (int num : array) {
                if (seen.add(num)) { // Only count if not seen in this array
                    frequency.put(num, frequency.getOrDefault(num, 0) + 1);
                }
            }
        }
        
        // Collect numbers that appear in all arrays
        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            if (entry.getValue() == nums.length) {
                result.add(entry.getKey());
            }
        }
        
        Collections.sort(result);
        return result;
    }
    
    public static void main(String[] args) {
        ArrayIntersectionSolutions solution = new ArrayIntersectionSolutions();
        
        // Test case
        int[][] nums = {
            {3, 1, 2, 4, 5},
            {1, 2, 3, 4},
            {3, 4, 5, 6}
        };
        
        System.out.println("Test array:");
        for (int[] array : nums) {
            System.out.println(Arrays.toString(array));
        }
        
        System.out.println("\nOriginal solution: " + solution.intersection2(nums));
        
        // Reset arrays since original solution modifies them
        int[][] nums1 = {{3, 1, 2, 4, 5}, {1, 2, 3, 4}, {3, 4, 5, 6}};
        int[][] nums2 = {{3, 1, 2, 4, 5}, {1, 2, 3, 4}, {3, 4, 5, 6}};
        int[][] nums3 = {{3, 1, 2, 4, 5}, {1, 2, 3, 4}, {3, 4, 5, 6}};
        
        System.out.println("Optimized solution 1 (HashSet): " + solution.intersectionOptimized1(nums1));
        System.out.println("Optimized solution 2 (Binary Search): " + solution.intersectionOptimized2(nums2));
        System.out.println("Optimized solution 3 (Frequency Count): " + solution.intersectionOptimized3(nums3));
    }
} 