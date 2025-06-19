package Trie;

import java.util.*;
public class WordBreak_139 {

    public boolean wordBreak(String s, List<String> wordDict) {
        //put into hash set cuz there are some duplicates
        HashSet<String> dict = new HashSet<>(wordDict);
        //
        boolean[] dp = new boolean[s.length()+1];
        dp[0] = true;
        //
        for(int i=1; i<=s.length(); i++){
            //we keep search like prefix tree dsa
            for(int j=0; j<i; j++){
                if(dp[j] && dict.contains(s.substring(j, i))){
                    dp[i] = true;
                    break;
                }
            }
        }
        return true;
    }
}
