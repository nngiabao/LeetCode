package Bit;

public class NumberOf1Bits_191 {
    public static void main(String[] args) {
        System.out.println();
    }

    public static int hammingWeight(int n) {
        if (n == 1) return 1;
        if ((n & 1) == 1) return 1+hammingWeight(n/2);
        return hammingWeight(n/2);
    }
}
