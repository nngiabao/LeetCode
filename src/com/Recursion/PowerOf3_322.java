package com.Recursion;

public class PowerOf3_322 {
    public static void main(String[] args) {

    }

    public static boolean isPowerOfThree(int n) {
        if(n <= 0) return false;
        if((n & 1)==1) return false;
        return isPowerOfThree(n/3);
    }
}
