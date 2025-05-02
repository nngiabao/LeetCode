package String;

import java.util.Arrays;

public class ConsecutiveCharacters_1446 {
    public static void main(String[] args) {
        ConsecutiveCharacters_1446 a = new ConsecutiveCharacters_1446();
        String s = "leetcode";
        a.maxPower(s);
    }
    //Solution 1:Using array letter
    public int maxPower(String s) {
        //
        int count = 1,max = 0;
        for(int i=1;i<s.length();i++){
            char c = s.charAt(i);
            char c_prev = s.charAt(i-1);
            if(c == c_prev) count++;
            else{
                max = Math.max(max,count);
                count = 1;
            }
        }
        return max;
    }
}
