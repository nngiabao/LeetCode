package Array;

public class Array_1480 {
    public static void main(String[] args) {
        int []nums = {1,2,3,4};
        for(int i=1; i<nums.length; i++){
            nums[i] = nums[i] + nums[i-1];
        }
        for(int i: nums){
            System.out.println(i);
        }
    }

    public int[] runningSum(int[] nums) {
        for(int i=1; i<nums.length; i++){
            nums[i] = nums[i] + nums[i-1];
        }
        return nums;
    }
}
