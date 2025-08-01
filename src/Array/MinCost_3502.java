package Array;

public class MinCost_3502 {
    public int[] minCosts(int[] cost) {
        //
        int[] min = new int[cost.length];
        min[0] = cost[0];
        for (int i = 1; i < cost.length; i++) {
            min[i] = Math.min(min[i - 1], cost[i]);
        }
        //
        return min;
    }
}
