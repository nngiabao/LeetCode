package Greedy;

import java.util.Arrays;

public class Buy2Chocolate_2706 {
    public int buyChoco(int[] prices, int money) {
        //sort array first
        Arrays.sort(prices);
        //
        int leftover = money-prices[0]+prices[1];
        //
        return (leftover < 0) ? money : leftover;
    }
}
