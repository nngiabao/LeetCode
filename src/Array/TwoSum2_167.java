package Array;

public class TwoSum2_167 {
    //Solution 1:Using BST
    public int[] twoSum(int[] numbers, int target) {
        //
        for(int i=0;i<numbers.length;i++){
            int complement = target - numbers[i];
            int pos = BST(numbers,complement,i);
            if( pos != -1) return new int[]{i+1, pos+1};
        }
         //
        return new int[]{0, 0};
    }
    //
    int BST(int[] nums, int target,int current) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target && mid != current) return mid;
            if (nums[mid] > target) right = mid - 1;
            else left = mid + 1;
        }
        return -1;
    }
}
