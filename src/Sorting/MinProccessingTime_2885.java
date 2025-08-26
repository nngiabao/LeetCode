package Sorting;

import java.util.*;
//

public class MinProccessingTime_2885 {
    //Solution 1:
    public int minProcessingTime(List<Integer> processorTime, List<Integer> tasks) {
        Collections.sort(processorTime);
        Collections.sort(tasks, Collections.reverseOrder());
        int tasks_len = tasks.size();
        int time_len = processorTime.size();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < tasks_len; i++) {
            //
            max = Math.max(max, tasks.get(i) + processorTime.get(i / 3));
            //
        }
        //for each
        return max;
    }

    //Solution 2:optimize version
    public int minProcessingTime2(List<Integer> processorTime, List<Integer> tasks) {
        int m = processorTime.size(), n = tasks.size();

        int[] p = new int[m];
        for (int i = 0; i < m; i++) p[i] = processorTime.get(i);
        int[] t = new int[n];
        for (int i = 0; i < n; i++) t[i] = tasks.get(i);

        Arrays.sort(p); // asc
        Arrays.sort(t); // asc

        int ans = 0;
        for (int i = 0; i < m; i++) {
            int finish = p[i] + t[n - 1 - 4 * i];
            if (finish > ans) ans = finish;
        }
        return ans;
    }
}
