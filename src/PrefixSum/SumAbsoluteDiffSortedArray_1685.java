package PrefixSum;

public class SumAbsoluteDiffSortedArray_1685 {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        int[] ans = new int[nums.length];
        int rem = 0;
        for (int i = 0;i < nums.length;i++) {
            sum -= nums[i];
            ans[i] = sum - ((ans.length - i - 1) * nums[i]) + (i * nums[i] - rem);
            rem += nums[i];
        }
        return ans;
    }
}
