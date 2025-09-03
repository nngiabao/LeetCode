package SlidingWindow;

import java.util.*;

public class CountCompleteSubArrays_2799 {
    public int countCompleteSubarrays(int[] nums) {
        int n = nums.length;

        // count distinct in the whole array
        Set<Integer> all = new HashSet<>();
        for (int x : nums) all.add(x);
        int D = all.size();

        int ans = 0;
        Map<Integer, Integer> freq = new HashMap<>();

        for (int l = 0; l < n; l++) {
            freq.clear();
            int distinct = 0;

            for (int r = l; r < n; r++) {
                int x = nums[r];
                int c = freq.getOrDefault(x, 0);
                if (c == 0) distinct++;
                freq.put(x, c + 1);

                if (distinct == D) {
                    // all endings r..n-1 work
                    ans += (n - r);
                    break; // move to next l
                }
            }
        }
        return ans;
    }
}
