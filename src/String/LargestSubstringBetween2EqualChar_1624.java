package String;

public class LargestSubstringBetween2EqualChar_1624 {
    public int maxLengthBetweenEqualCharacters(String s) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<s.length()/2; i++){
            char c = s.charAt(i);
            int f_index = s.indexOf(c);
            int l_index = s.lastIndexOf(c);
            if(f_index != l_index ){
                max = Math.max(l_index-f_index-1,max);
            }
        }
        return -1;
    }
}
