package Array;

import java.util.*;

public class SortArrayByIncreasingFreq_1636 {
    //SOlution 1:Optimize
    public int[] frequencySort(int[] nums) {
        // Step 1: Count frequencies
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Sort with custom comparator
        // First by frequency ASC, then by value DESC
        Integer[] boxed = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(boxed, (a, b) -> {
            int freqCompare = Integer.compare(freqMap.get(a), freqMap.get(b));
            if (freqCompare != 0) return freqCompare; // freq ascending
            return Integer.compare(b, a); // value descending
        });

        // Step 3: Convert back to int[]
        return Arrays.stream(boxed).mapToInt(Integer::intValue).toArray();
    }
}
