package Math;

public class ReverseInteger_7 {
    //SOlution 1:Using string only for small input
    public int reverse(int x) {
        StringBuilder sb = new StringBuilder(String.valueOf(x));
        if(x < 0) sb.deleteCharAt(0);
        long rev = Integer.parseInt(sb.reverse().toString());
        return (x < 0) ? (int) rev*-1 : (int) rev;
    }
    //Solution 2:Using math
    public int reverse2(int x) {
        int rev = 0;
        while(x != 0) {
            //check edge cases - overflow
            if( rev > Integer.MAX_VALUE /10 || rev == Integer.MAX_VALUE /10 && x %10 ==7) return 0;
            if( rev < Integer.MIN_VALUE /10 || rev == Integer.MIN_VALUE /10 && x %10 ==8) return 0;
            rev = rev * 10 + x % 10;
            x /=10;
        }
        return (x < 0) ? rev*-1 : rev;
    }
}
