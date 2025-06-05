package Array;

public class BuyAndSellStock_121 {
    //Solution 1:Brute fore
    public int maxProfit(int[] prices) {
        int profit = 0;

        if(prices.length == 1) return 0;
        else{
            int min = prices[0];
            for(int i = 1; i < prices.length; i++) {
                if(prices[i] < min) min = prices[i];
                if(prices[i] - min > profit) profit = prices[i] - min;
            }
        }
        return (profit<=0) ? 0 : profit;
    }

    //Solution 2: Using DP - Kane ALgo - not done
    public int maxProfit2(int... prices){
        int profit = 0;
        int len = prices.length;
        int[] dp = new int[len];
        dp[0] = 0;
        for(int i=1;i<len;i++){
            //dp[i] = Math.max(dp[i-1],);
            profit = Math.max(profit,dp[i]);
        }
        return profit;
    }

}
