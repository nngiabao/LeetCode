package Heap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TheKWeakestRows_1337 {
    public int[] kWeakestRows(int[][] mat, int k) {
        // Map to store row index -> soldier count
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) count++;
                else break; // since soldiers (1s) are always before civilians (0s)
            }
            map.put(i, count);
        }

        // PriorityQueue to sort by soldier count, then by row index
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
                (a, b) -> {
                    if (!a.getValue().equals(b.getValue())) {
                        return a.getValue() - b.getValue(); // fewer soldiers first
                    } else {
                        return a.getKey() - b.getKey(); // smaller index first
                    }
                }
        );

        pq.addAll(map.entrySet());

        // Extract k weakest row indices
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            Map.Entry<Integer, Integer> entry = pq.poll();
            res[i] = entry.getKey();
        }

        return res;
    }

}
