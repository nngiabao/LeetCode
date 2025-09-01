package SlidingWindow;

import com.sun.source.tree.Tree;

import java.util.*;

public class FindXSumSubarraysI_3318 {

    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        int[] freq = new int[51]; // values 1..50

        // build first window
        for (int i = 0; i < k; i++) freq[nums[i]]++;
        ans[0] = xSum(freq, k, x);

        // slide the window
        for (int i = 1; i <= n - k; i++) {
            freq[nums[i - 1]]--;
            freq[nums[i + k - 1]]++;
            ans[i] = xSum(freq, k, x);
        }
        return ans;
    }

    // pick top x by (freq desc, value desc) without sorting
    private int xSum(int[] freq, int k, int x) {
        int need = x, sum = 0;
        for (int c = k; c >= 1 && need > 0; c--) {
            for (int v = 50; v >= 1 && need > 0; v--) {
                if (freq[v] == c) {
                    sum += c * v;
                    need--;
                }
            }
        }
        return sum;
    }

}
