package Math;

import java.util.Arrays;

public class Dec2Hex_405 {

    public static void main(String[] args) {
        System.out.println(toHex(26));
    }

    //Solution 1: Basic
    public static String toHex(int num) {

        if (num == 0) return "0";
        StringBuilder res = new StringBuilder();
        if(num > 0 ){
            String tmp = Integer.toHexString(num);
            for(int i = 0 ; i < tmp.length() ; i+=4){
                res.append(tmp.charAt(i));
            }
            //for(

        }else{

        }
        return "";
    }
    //num -> bin -> dec
    public char[] toBin(int num) {
        int i=0;char[] bin = new char[8];
        while(num != 0){
            bin[i] = (char)(num % 2);
            num /= 2;
            i++;
        }
        return bin;
    }
    //bin -> dec
    public static char[] binaryToHex(char[] binary) {
        int len = binary.length;
        int pad = (4 - len % 4) % 4;

        // Create new array with padding
        char[] padded = new char[len + pad];
        for (int i = 0; i < pad; i++) padded[i] = '0';
        for (int i = 0; i < len; i++) padded[i + pad] = binary[i];

        int hexLen = padded.length / 4;
        char[] hex = new char[hexLen];

        for (int i = 0; i < hexLen; i++) {
            int val = 0;
            for (int j = 0; j < 4; j++) {
                val = val * 2 + (padded[i * 4 + j] - '0');
            }

            if (val < 10) hex[i] = (char) ('0' + val);
            else hex[i] = (char) ('A' + val - 10);
        }

        return hex;
    }

    //Solution 2:
    public String toHex2(int num) {
        return Integer.toHexString(num).toString();
    }

}
