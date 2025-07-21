package MonotonicStack;

public class ShortestUnsortedArray_561 {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;
        int start = -1, end = -1;

        int maxSeen = Integer.MIN_VALUE;
        int minSeen = Integer.MAX_VALUE;

        // Left to right: find end boundary
        for (int i = 0; i < n; i++) {
            if (nums[i] < maxSeen) {
                end = i;
            } else {
                maxSeen = nums[i];
            }
        }

        // Right to left: find start boundary
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] > minSeen) {
                start = i;
            } else {
                minSeen = nums[i];
            }
        }

        return (end == -1) ? 0 : end - start + 1;
    }
}
