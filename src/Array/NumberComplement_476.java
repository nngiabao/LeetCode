package Array;

public class NumberComplement_476 {
    public int findComplement(int num) {
        return num ^ ((1 << (Integer.toBinaryString(num).length())) - 1);
    }
    //Solution 2:
    public int findComplement2(int num) {
        for (long i = 1; i <= num; i <<= 1)
            num ^= i;
        return num;
    }
}
