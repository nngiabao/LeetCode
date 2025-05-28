package Greedy;

import java.util.Arrays;

public class MaxOddBinNum_2864 {
    //Solution 1
    public String maximumOddBinaryNumber(String s) {
        //convert to char array first
        char[] a_char = s.toCharArray();
        Arrays.sort(a_char);
        //
        StringBuilder sb = new StringBuilder(new String(a_char));
        sb.deleteCharAt(sb.length()-1);
        return sb.reverse().append('1').toString();
    }
    //Solution 2: better approach - DP
    public String maximumOddBinaryNumber2(String s) {
        StringBuilder sb = new StringBuilder();
        //sb.append
        //sb.de
        return "";
    }
}
