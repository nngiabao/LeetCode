package Greedy;

import java.util.Arrays;

public class MinSum4Digit_2160 {
    public static void main(String[] args) {
        MinSum4Digit_2160 a = new MinSum4Digit_2160();
        a.minimumSum(2932);

    }
    public int minimumSum(int num) {
        //convert to String
        char[] str = String.valueOf(num).toCharArray();
        Arrays.sort(str);
        String s = new String(str);
        return (s.charAt(0)-'0'*10+s.charAt(2)-'0')+
        (s.charAt(1)-'0'*10+s.charAt(3)-'0');
    }
}
