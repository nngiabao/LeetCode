package DP;

import java.util.*;
public class FindOriginalTypedString_3333 {
    private static final int MOD = 1_000_000_007;

    public int possibleStringCount(String word, int k) {
        List<Integer> groups = new ArrayList<>();
        int n = word.length();
        int i = 0;

        // Step 1: Group identical characters
        while (i < n) {
            int j = i;
            while (j < n && word.charAt(j) == word.charAt(i)) {
                j++;
            }
            groups.add(j - i); // group length
            i = j;
        }

        int m = groups.size(); // min possible original length
        if (m < k) return 0;

        // Step 2: DP - count ways to pick group sizes adding to length >= k
        // dp[i] = number of ways to build string of length i
        int maxLen = n;
        long[] dp = new long[maxLen + 1];
        dp[0] = 1;

        for (int groupLen : groups) {
            long[] next = new long[maxLen + 1];
            for (int len = 0; len <= maxLen; len++) {
                if (dp[len] == 0) continue;
                for (int use = 1; use <= groupLen; use++) {
                    if (len + use <= maxLen)
                        next[len + use] = (next[len + use] + dp[len]) % MOD;
                }
            }
            dp = next;
        }

        long result = 0;
        for (int len = k; len <= maxLen; len++) {
            result = (result + dp[len]) % MOD;
        }

        return (int) result;
    }
}
