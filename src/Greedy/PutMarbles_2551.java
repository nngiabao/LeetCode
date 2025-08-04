package Greedy;

import java.util.Arrays;

public class PutMarbles_2551 {
    public long putMarbles(int[] weights, int k) {
        //find max and min
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int len = weights.length;
        if (len == k) return 0;
        //
        Arrays.sort(weights);
        for(int i = 0; i < len-k; i++) {
            min = Math.min(min, weights[i]+weights[i+k]);
            max = Math.max(max, weights[i]+weights[i+k]);
        }
        //
        //
        //
        //
        ///
        return max-min;
    }
}
