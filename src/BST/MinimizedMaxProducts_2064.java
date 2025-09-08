package BST;

import java.util.Arrays;

public class MinimizedMaxProducts_2064 {
    public int minimizedMaximum(int n, int[] quantities) {
        int low = 1;
        int high = 0;

        // find max quantity for high
        for (int q : quantities) {
            high = Math.max(high, q);
        }

        // binary search on the answer
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (canDistribute(quantities, n, mid)) {
                high = mid;   // feasible → try smaller
            } else {
                low = mid + 1; // not feasible → need bigger
            }
        }

        return low; // or high (they converge)
    }

    // helper function to check feasibility
    private boolean canDistribute(int[] quantities, int n, int x) {
        int storesNeeded = 0;
        for (int q : quantities) {
            // number of stores needed for this product
            storesNeeded += (q + x - 1) / x; // ceil(q / x)
            if (storesNeeded > n) return false; // too many stores
        }
        return true;
    }
}
