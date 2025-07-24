package SlidingWindow;

import java.util.*;

public class RepeatedDNASequences_187 {
    //Solution 1:
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> res = new ArrayList<>();
        //
        HashSet<String> seen = new HashSet<>();
        HashSet<String> dup = new HashSet<>();
        //keep sliding window
        int len = s.length();
        for(int i = 0; i < len-9; i++) {
            String temp = s.substring(i, i+10);
            if(!seen.contains(temp)) {
                seen.add(temp);
            }else dup.add(temp);
        }
        //return res
        for(String str : dup) {
            res.add(str);
        }
        return res;
    }
    //Solution 2:
}
