package Bit;

public class BinNumberAlternatingBits_693 {
    //Solution 1:Using brute-force
    public boolean hasAlternatingBits(int n) {
        String n_bin = Integer.toBinaryString(n);
        for(int i=1;i<n_bin.length();i++){
            if(n_bin.charAt(i) == n_bin.charAt(i-1)) return false;
        }
        return true;
    }
    //Solution 2:Using bitwise XOR
    public boolean hasAlternatingBits2(int n) {
        int xor = n ^ (n >> 1);
        return (xor & (xor + 1)) == 0;
    }
}
