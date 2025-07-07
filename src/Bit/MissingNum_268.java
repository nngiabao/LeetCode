package Bit;

public class MissingNum_268 {
    public static void main(String[] args) {
        int [] a = {0,1,3};
        System.out.println(missingNumber(a));
    }

    public static int missingNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= i^ nums[i];
        }
        return nums.length^result;
    }
}
