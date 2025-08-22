package Greedy;

import java.util.*;

//
public class MinIndexSplit_2780 {
    //Solution 1: only for small input => TLE for large
    public int minimumIndex(List<Integer> nums) {
        int n = nums.size();
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) temp[i] = nums.get(i);

        // try every valid split i: 0 .. n-2
        for (int i = 0; i < n - 1; i++) {
            int[] left  = Arrays.copyOfRange(temp, 0, i + 1);
            int[] right = Arrays.copyOfRange(temp, i + 1, n);

            int dl = dominantOrNone(left);
            if (dl == Integer.MIN_VALUE) continue; // left has no dominant

            int dr = dominantOrNone(right);
            if (dl == dr) return i;               // both sides dominant by same value
        }
        return -1;
    }

    private int dominantOrNone(int[] a) {
        Arrays.sort(a);
        int m = a.length;
        int cand = a[m / 2];          // if a dominant exists, it must sit here after sort
        int cnt = 0;
        for (int v : a) if (v == cand) cnt++;
        return (cnt * 2 > m) ? cand : Integer.MIN_VALUE; // verify "more than half"
    }

}
