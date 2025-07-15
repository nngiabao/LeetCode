package Heap;

import java.util.*;

public class FindKParisSmallestSum_373 {
    //Solution 1:Using max-heap
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums1.length == 0 || nums2.length == 0 || k == 0) return res;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) ->
                (nums1[a[0]] + nums2[a[1]]) - (nums1[b[0]] + nums2[b[1]])
        );

        // Only pair first k elements from nums1 with nums2[0]
        for (int i = 0; i < Math.min(nums1.length, k); i++) {
            pq.offer(new int[]{i, 0}); // index pair (i, 0)
        }

        while (k-- > 0 && !pq.isEmpty()) {
            int[] idxPair = pq.poll();
            int i = idxPair[0], j = idxPair[1];

            res.add(Arrays.asList(nums1[i], nums2[j]));

            // Move to the next element in nums2
            if (j + 1 < nums2.length) {
                pq.offer(new int[]{i, j + 1});
            }
        }

        return res;
    }
}
