package DP;

public class WiggleSubsequence_376 {
    public static void main(String[] args) {
        WiggleSubsequence_376 a = new WiggleSubsequence_376();
        int[] b = {0,0};
        a.wiggleMaxLength2(b);
    }
    public int wiggleMaxLength(int[] nums) {
        //
        int n = nums.length;
        if (n == 1) return 0;
        int[] dp = new int[n - 1];
        //
        boolean status = false;// if false = neg // true = pos
        //check the first status

        //
        for (int i = 1; i <= nums.length; i++) {
            //
            if (status) {
            }
        }
        //

        //
        return 1;
    }

    //Solution 2:
    public int wiggleMaxLength2(int[] nums) {
        //
        int n = nums.length;
        //
        if (n == 1) return 1;
        //
        int[] gap = new int[n - 1];

        //check the gap
        for (int i = 1; i < n; i++) {
            gap[i - 1] = nums[i] - nums[i-1];
        }
        //try to check the first pos status
        boolean pos = false;
        for (int i = 0; i < n-1; i++) {
            if (gap[i] > 0) {
                pos = true;
                break;
            } else if (gap[i] < 0) {
                pos = false;
                break;
            }
            if (i == n-2) return 1;
        }
        //boolean pos = (gap) ? true : false;
        int count = 2;
        for (int i = 1; i < n; i++) {
            if (gap[i] == 0) continue;
            if ((gap[i] < 0 && pos == true) || (gap[i] > 0 && pos == false)) {
                pos = !pos;
                count++;
            }
        }
        return count;
    }
}
