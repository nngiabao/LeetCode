package String;

import java.util.*;
import java.util.HashSet;

public class LongestSubStringWoRepeat_3 {
    public static void main(String[] args) {
        LongestSubStringWoRepeat_3 a = new LongestSubStringWoRepeat_3();
        String s = "abcabcbb";
        a.lengthOfLongestSubstring(s);
    }
    //Solution 1:Using sliding window
    public int lengthOfLongestSubstring(String s) {
        int i = 1, n = s.length(),max=0;
        //2 edge cases
        if(n == 0) return 0;
        if(n == 1) return 1;
        StringBuilder longestSubstring = new StringBuilder();
        longestSubstring.append(s.charAt(0));
        while (i < n) {
            char c = s.charAt(i);
            int index = longestSubstring.indexOf(String.valueOf(c));
            if(index>-1){
                max = Math.max(max,longestSubstring.length());
                //delete from begining until the dup character
                longestSubstring.delete(0,index+1);
            }
            longestSubstring.append(c);
            i++;
        }
        return Math.max(max,longestSubstring.length());
    }

    //Solution 2:Using hash table - not good
    public int lengthOfLongestSubstring2(String s) {
        //
        int i = 0, n = s.length(),max=0;
        //2 edge cases
        if(n == 0) return 0;
        if(n == 1) return 1;
        StringBuilder longestSubstring = new StringBuilder();
        //put into hash table
        List<String> result = new ArrayList<>();
        while (i < n) {
            char c = s.charAt(i);
            int index = longestSubstring.indexOf(String.valueOf(c));
            if(index>-1){
                result.add(longestSubstring.toString());
                longestSubstring.delete(0,index+1);
            }
            longestSubstring.append(c);
            i++;
        }
        //add the last sub string
        result.add(longestSubstring.toString());
        for(String str : result){
            max = Math.max(max,str.length());
        }
        return max;
    }
}
