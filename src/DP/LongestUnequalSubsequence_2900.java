package DP;

import java.util.*;

public class LongestUnequalSubsequence_2900 {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        //
        List<String> res = new ArrayList<>();
        res.add(words[0]);
        int cur = groups[0];
        if(groups.length == 0) return res;
        //
        for(int i = 1; i < words.length; i++) {
            if(groups[i] != cur) {
                res.add(words[i]);
                cur = groups[i];
            }
        }
        ///
        //
        return res;
    }
}
