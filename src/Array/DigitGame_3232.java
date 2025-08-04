package Array;

public class DigitGame_3232 {
    public boolean canAliceWin(int[] nums) {
        //
        int sumDigit = 0, sum2Digit = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] < 10) {
                sumDigit+=nums[i];
            } else sum2Digit+=nums[i];
        }
        //
        return (sumDigit == sum2Digit) ? false : true;
    }
}
