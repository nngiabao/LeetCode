package Greedy;

import java.util.*;

public class MaxUniqueSubArray_3487 {
    public int maxSum(int[] nums) {
        Set<Integer> seenPos = new HashSet<>();
        long posSum = 0;
        int maxElem = Integer.MIN_VALUE;
        boolean hasZero = false;

        for (int x : nums) {
            maxElem = Math.max(maxElem, x);
            if (x == 0) hasZero = true;
            if (x > 0 && seenPos.add(x)) posSum += x; // one copy per positive value
        }

        if (posSum > 0) return (int) posSum;
        if (hasZero) return 0;
        return maxElem;
    }
}
