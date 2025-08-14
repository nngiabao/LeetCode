package Matrix;

import java.util.*;

public class MergeInterval_56 {
    //Solution 1:Using pq
    public int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length == 0) return new int[0][2];
        if (intervals.length == 1) return new int[][] { intervals[0] };

        PriorityQueue<Integer> pqStart = new PriorityQueue<>();
        PriorityQueue<Integer> pqEnd   = new PriorityQueue<>();

        for (int[] it : intervals) {
            pqStart.add(it[0]);
            pqEnd.add(it[1]);
        }

        int start = pqStart.poll();
        int end   = pqEnd.poll();

        List<int[]> merged = new ArrayList<>();

        // As long as there are more starts to consider
        while (!pqStart.isEmpty()) {
            // If next start overlaps current [start, end], extend the end
            if (pqStart.peek() <= end) {
                pqStart.poll();
                end = Math.max(end, pqEnd.poll());
            } else {
                // No overlap -> push current and start a new block
                merged.add(new int[]{start, end});
                start = pqStart.poll();
                end   = pqEnd.poll();
            }
        }

        // Add the last active interval
        merged.add(new int[]{start, end});

        // Build result
        int[][] res = new int[merged.size()][2];
        for (int i = 0; i < merged.size(); i++) {
            res[i][0] = merged.get(i)[0];
            res[i][1] = merged.get(i)[1];
        }
        return res;
    }
    //Solution 2:Sort first
}
