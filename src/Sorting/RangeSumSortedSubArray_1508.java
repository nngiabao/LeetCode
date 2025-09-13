package Sorting;

public class RangeSumSortedSubArray_1508 {
    public static void main(String[] args) {
        RangeSumSortedSubArray_1508 a = new RangeSumSortedSubArray_1508();
            int[] num = {1, 2, 3, 4};
        a.rangeSum(num,4,1,5);

    }
    public int rangeSum(int[] nums, int n, int left, int right) {
        int sum = 0;
        int[] subArray = new int[n*(n+1)/2];
        int len = subArray.length;
        subArray[0] = nums[0];
        //prefix sum
        for(int i = 1; i < len; i++){
            subArray[i] = nums[i%(n-1)]+nums[i%(n-1)-1];
        }
        //
        return 1;
    }
}
