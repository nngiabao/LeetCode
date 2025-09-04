package Greedy;

import java.util.Arrays;

public class MinNumInc_1526 {
    public int minNumberOperations(int[] target) {
        int n = target.length;
        int count = target[0];  // first element always needs this many ops
        //
        for (int i = 1; i < n; i++) {
            if (target[i] > target[i - 1]) {
                count += target[i] - target[i - 1];
            }
        }
        return count;
    }
}
