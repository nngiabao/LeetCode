package BitMasking;

public class PartitionArrayTwoEqualProductSubsets_3566 {
    public boolean checkEqualPartitions(int[] nums, long target) {
        int n = nums.length;

        // Loop over all bitmasks (excluding 0 and full set)
        for (int mask = 1; mask < (1 << n) - 1; mask++) {
            long product1 = 1;
            long product2 = 1;
            boolean valid1 = false;
            boolean valid2 = false;

            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    product1 *= nums[i];
                    valid1 = true;
                    if (product1 > target) break; // optional pruning
                } else {
                    product2 *= nums[i];
                    valid2 = true;
                    if (product2 > target) break;
                }
            }

            // Check both subsets are non-empty and match the target
            if (valid1 && valid2 && product1 == target && product2 == target)
                return true;
        }

        return false;
    }
}
