package Greedy;

import java.util.Arrays;

public class MinCostBuyingCandies_2144 {
    public int minimumCost(int[] cost) {
        //edge case = 1
        if(cost.length == 1) return cost[0];
        //we have to sort array by 1-indexed
        //so we can find the max value of discount candies
        //=> min cost of buying candies
        Arrays.sort(cost);
        for (int i = 0; i < cost.length / 2; i++) {
            int temp = cost[i];
            cost[i] = cost[cost.length - 1 - i];
            cost[cost.length - 1 - i] = temp;
        }
        //every 2 candies we can find the free candies
        int sum = 0;
        for (int i = 0; i < cost.length; i++) {
            if((i%3) != 2 ) sum += cost[i];
        }
        return sum;
    }
}
