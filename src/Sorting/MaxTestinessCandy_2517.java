package Sorting;

import java.util.Arrays;

public class MaxTestinessCandy_2517 {
    public int maximumTastiness(int[] price, int k) {
        //
        int n = price.length;
        Arrays.sort(price);
        int min = Integer.MAX_VALUE;
        for(int i= n-2; i>=n-k; i--) {
            min = Math.min(min, price[i+1]-price[i]);
        }
        return min;
    }
}
