public class BuyAndSellStock_121 {
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
}
