package Math;

public class Devide2Integers_29 {
    //Solution 1:TLE in big test case
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        boolean negative = (dividend < 0) ^ (divisor < 0);

        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);
        int result = 0;

        while (a >= b) {
            a -= b;
            result++;
        }

        return negative ? -result : result;
    }
    //Solution 2:

}
