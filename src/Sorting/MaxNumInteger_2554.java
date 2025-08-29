package Sorting;

import java.util.*;
import java.util.List;

public class MaxNumInteger_2554 {
    //Solution 1: SOrting
    public int maxCount(int[] banned, int n, int maxSum) {
        Arrays.sort(banned);
        int m = banned.length, p = 0;
        int sum = 0, count = 0;

        for (int i = 1; i <= n; i++) {
            // Advance pointer past values < i (and skip duplicates naturally)
            while (p < m && banned[p] < i) p++;

            // Skip if i is banned
            if (p < m && banned[p] == i) continue;

            // Check sum before adding
            if (sum + i > maxSum) break;

            sum += i;
            count++;
        }
        return count;
    }
    //Solution 2:Put in a set
    public int maxCount2(int[] banned, int n, int maxSum) {
        //put banned in a list
        Set<Integer> ban = new HashSet<>();
        for (int x : banned) ban.add(x);

        int sum = 0, count = 0;
        for (int i = 1; i <= n; i++) {
            if (ban.contains(i)) continue;
            if (sum + i > maxSum) break;  // numbers only increase; no future i will fit
            sum += i;
            count++;
        }
        return count;

    }
}
