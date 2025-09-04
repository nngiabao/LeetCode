package Two_pointer;

import java.util.PriorityQueue;

public class TheKthSmallestPrimeFraction_786 {
    //Solution 1:Using Min-heap
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        int n = arr.length;
        // Min-heap based on fraction value
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) ->
                Double.compare((double)arr[a[0]] / arr[a[1]], (double)arr[b[0]] / arr[b[1]])
        );

        // Initialize heap with fractions arr[0]/arr[j]
        for (int j = 1; j < n; j++) {
            pq.offer(new int[]{0, j});
        }

        // Pop k-1 smallest fractions
        for (int t = 0; t < k - 1; t++) {
            int[] cur = pq.poll();
            int i = cur[0], j = cur[1];
            if (i + 1 < j) {
                pq.offer(new int[]{i + 1, j});
            }
        }

        // kth smallest fraction
        int[] ans = pq.poll();
        return new int[]{arr[ans[0]], arr[ans[1]]};
    }
}
