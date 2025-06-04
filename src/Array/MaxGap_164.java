package Array;

import java.util.Arrays;

public class MaxGap_164 {
    //Using built-in java sorting
    public int maximumGap(int[] nums) {
        int len = nums.length;
        if (len < 2) return 0;
        Arrays.sort(nums);
        //
        //int start = 0;
        int max=0;
        for (int i = 1; i < len; i++) {
            if(nums[i] != nums[i-1]) max = Math.max(max, nums[i]-nums[i-1]);
        }
        return max;
    }
    //Solution 2:Using radix sort
    public int maximumGap2(int[] nums) {
        if (nums.length < 2) return 0;

        radixSort(nums);

        int maxGap = 0;
        for (int i = 1; i < nums.length; i++) {
            maxGap = Math.max(maxGap, nums[i] - nums[i - 1]);
        }

        return maxGap;
    }

    // LSD Radix Sort for positive integers
    private void radixSort(int[] nums) {
        int max = getMax(nums);

        int exp = 1;
        int n = nums.length;
        int[] output = new int[n];

        while (max / exp > 0) {
            int[] count = new int[10];

            // Count digit occurrences
            for (int num : nums) {
                int digit = (num / exp) % 10;
                count[digit]++;
            }

            // Cumulative count
            for (int i = 1; i < 10; i++) {
                count[i] += count[i - 1];
            }

            // Build output array (right to left to ensure stability)
            for (int i = n - 1; i >= 0; i--) {
                int digit = (nums[i] / exp) % 10;
                output[--count[digit]] = nums[i];
            }

            // Copy back to original
            System.arraycopy(output, 0, nums, 0, n);
            exp *= 10;
        }
    }

    private int getMax(int[] nums) {
        int max = nums[0];
        for (int num : nums) {
            max = Math.max(max, num);
        }
        return max;
    }
}
