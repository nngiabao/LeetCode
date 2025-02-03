package Bit;

public class ReverseBits_190 {
    public static void main(String[] args) {
        System.out.println(123&1);
    }

    public int reverseBits(int n) {
        int result=0;
        for(int i=0;i<32;i++){
            result = (result<<1) | (n&1);
            n >>>= 1;
        }
        return result;
    }
}
