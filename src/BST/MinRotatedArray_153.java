package BST;

public class MinRotatedArray_153 {
    //SOlution 1: Brute-force
    public int findMin(int[] nums) {
        int min = nums[0];
        for(int num : nums){
            min = Math.min(min,num);
        }
        return min;
    }
    //BST
    public int findMin2(int[] nums) {
        int len = nums.length;
        if(len == 1) return nums[0];
        //
        int left=0,right=len-1;
        while(left<right){
            int mid = left+(right-left)/2;
            if(nums[mid]>nums[right]) left = mid+1;
            else right = mid;
        }
        return nums[left];
    }
}
