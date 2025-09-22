package Two_pointer;

public class FindIndicesWithIndexValue2_2905 {
    //Solution 1:Using 2 pointers but for small constraint
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        //
        int len = nums.length;
        int i = 0, j = i + indexDifference;
        //
        while (i < len - indexDifference) {
            if (j == len) {
                i++;
                j = i + indexDifference;
            } else if (Math.abs(nums[i] - nums[j]) >= valueDifference) return new int[]{i, j};
            else j++;
        }
        //
        return new int[]{-1, -1};
    }
    //Solution 2: Using 2 pointers but more optimized
    public int[] findIndices2(int[] nums, int indexDifference, int valueDifference) {
        int n = nums.length;
        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;
        int minIdx = -1, maxIdx = -1;
        //
        for (int j = 0; j < n; j++) {
            int i = j - indexDifference;  // leftmost valid index
            // Update min/max if i is valid
            if (i >= 0) {
                if (nums[i] < minVal) {
                    minVal = nums[i];
                    minIdx = i;
                }
                if (nums[i] > maxVal) {
                    maxVal = nums[i];
                    maxIdx = i;
                }
            }
            // Check conditions using min/max
            if (minIdx != -1 && Math.abs(nums[j] - minVal) >= valueDifference) {
                return new int[]{minIdx, j};
            }
            if (maxIdx != -1 && Math.abs(nums[j] - maxVal) >= valueDifference) {
                return new int[]{maxIdx, j};
            }
        }
        return new int[]{-1, -1};
    }

}
