package Array;

public class SumGoodNum_3452 {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int sum = 0;
        int len = nums.length;
        for(int i = 0; i < len; i++){
            if ((i - k < 0 || nums[i] > nums[i - k]) &&
                    (i + k >= len || nums[i] > nums[i + k])) {
                sum += nums[i];
            }
        }
        return sum;
    }
}
