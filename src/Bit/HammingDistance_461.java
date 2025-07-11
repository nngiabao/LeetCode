package Bit;

public class HammingDistance_461 {
    //Solution 1: Using 2 pointers
    public int hammingDistance(int x, int y) {
        int count = 0;
        String x_bin = Integer.toBinaryString(x);
        String y_bin = Integer.toBinaryString(y);
        //we have to make the length equal
        while (x_bin.length() < y_bin.length()) x_bin = "0" + x_bin;
        while (x_bin.length() > y_bin.length()) y_bin = "0" + y_bin;
        //find number of different bit
        for(int i = 0; i < x_bin.length(); i++){
            char c_x = x_bin.charAt(i);
            char c_y = y_bin.charAt(i);
            if(c_x != c_y) count++;
        }
        return count;
    }
    //Solution 2:Using XOR
    public int hammingDistance2(int x, int y) {
        int xor = x ^ y; // XOR will have 1s where bits differ
        int count = 0;
        while (xor != 0) {
            count += xor & 1; // count set bits
            xor >>= 1;
        }
        return count;
    }
}

