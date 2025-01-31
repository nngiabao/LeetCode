package com.Recursion;

public class PowerOfTwo_231 {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(6));
        System.out.println(3 & 1);
    }

    //recursion
    public static boolean isPowerOfTwo(int n) {
        if (n == 0) return false;
        if (n == 1) return true;
        if ((n & 1) == 0) return isPowerOfTwo(n / 2);
        return false;
    }

    //best - using bitwise
    public boolean isPowerOfTwo2(int n) {
        //bitwise operator
        // n & (n-1)
        // "n&(n-1) = " + (a & b)
        Integer bitn = n & (n - 1);
        if (n <= 0) {
            return false;
        } else if (bitn == 0) {
            // System.out.println( (n & (n-1)));
            return true;
        } else {
            return false;
        }
    }
}
