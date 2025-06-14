package Greedy;

import java.util.Arrays;

public class MinimizeMaxDiff_2616 {
    public static int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);  // Step 1: Sort the array

        int low = 0, high = nums[nums.length - 1] - nums[0];
        int answer = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canFormPairs(nums, p, mid)) {
                answer = mid;     // mid is a valid solution, try to find a smaller one
                high = mid - 1;
            } else {
                low = mid + 1;    // mid is too small, try a bigger one
            }
        }

        return answer;
    }

    private static boolean canFormPairs(int[] nums, int p, int maxDiff) {
        int count = 0;
        int i = 0;

        while (i < nums.length - 1) {
            if (nums[i + 1] - nums[i] <= maxDiff) {
                count++;
                i += 2;  // use both i and i+1 (disjoint pair)
            } else {
                i++;     // skip to next element
            }

            if (count >= p) return true;
        }

        return false;
    }
}
