package Array;
import java.util.HashMap;

public class TwoSum_1 {
    public static void main(String[] args) {
        int input[] ={2,7,11,15},target=9;


    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Check if the complement exists in the map
            if (map.containsKey(complement)) {
                // Return the indices of the current number and its complement
                return new int[]{map.get(complement), i};
            }

            // Add the current number and its index to the map
            map.put(nums[i], i);
        }
        return null;
    }

    /// Solution 2:Using BST
    public int[] twoSum2(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            int index = BST(nums,complement);
            if(index != -1 && index != i){
                return new int[]{i,index};
            }
        }
        return null;
    }

    //BST method
    public int BST(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        while(left < right){
            int mid = left+(right-left)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] < target) left = mid+1;
            else right = mid-1;
        }
        return -1;//no exists
    }
}

