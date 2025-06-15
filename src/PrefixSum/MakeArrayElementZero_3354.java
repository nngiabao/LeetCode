package PrefixSum;

public class MakeArrayElementZero_3354 {
    public int countValidSelections(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                if (simulate(nums, i, true)) count++;  // right
                if (simulate(nums, i, false)) count++; // left
            }
        }

        return count;
    }

    // Helper to simulate one run
    private boolean simulate(int[] original, int start, boolean toRight) {
        int[] nums = original.clone(); // Don't mutate original
        int n = nums.length;
        int curr = start;
        int dir = toRight ? 1 : -1;

        while (curr >= 0 && curr < n) {
            if (nums[curr] == 0) {
                curr += dir; // move forward
            } else {
                nums[curr]--; // decrement
                dir *= -1;    // reverse direction
                curr += dir;
            }
        }

        // Check if all elements became 0
        for (int val : nums) {
            if (val != 0) return false;
        }

        return true;
    }

}
