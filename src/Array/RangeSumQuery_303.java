package Array;

public class RangeSumQuery_303 {
    int[] arr;
    public RangeSumQuery_303(int[] nums) {
        this.arr = nums;
    }

    public int sumRange(int left, int right) {
        int sum= 0;
        while (left < right) {
            sum += arr[left];
            left++;
        }
        return sum;
    }
}
