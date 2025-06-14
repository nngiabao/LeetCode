package DP;

import java.util.Arrays;

public class CoinChange_322 {
    public int coinChange(int[] coins, int amount) {
        if(amount == 0) return 0;
        int [] dp = new int[amount];
        int len = coins.length;
        //we have to fill all element = max
        dp[0] = 0;
        Arrays.fill(dp, Integer.MAX_VALUE);
        for(int i=1 ; i<=amount ; i++){
            for(int coin : coins){
                //
                if(i-coin >= 0 && dp[i-coin] != Integer.MAX_VALUE)
                    dp[i] = Math.min(dp[i], dp[i-coin]+1);
            }
        }
        //if we can reach amount => return -1
        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }
}
