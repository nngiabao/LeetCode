package Greedy;

public class LexicalSmallestSwap_3216 {
    public String getSmallestString(String s) {
        //
        char[] chars = s.toCharArray();
        for(int i = 1; i < chars.length; i++) {
            int prev_c = chars[i-1]-'0';
            int cur_c = chars[i]-'0';
            if(prev_c > cur_c && ((((prev_c&1)==0) && (cur_c&1)==0)|| (((prev_c&1)==1) && (cur_c&1)==1))){
                char temp = chars[i];
                chars[i] = chars[i-1];
                chars[i-1] = temp;
                return String.valueOf(chars);
            }
        }
        //
        //
        return s;
    }
}
