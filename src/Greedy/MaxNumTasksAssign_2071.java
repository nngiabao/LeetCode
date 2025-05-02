package Greedy;

import java.util.Arrays;

public class MaxNumTasksAssign_2071 {
    public static void main(String[] args) {
        int[] task = {5, 9, 8, 5, 9};
        int[] workers = {1, 6, 4, 2, 6};
        int pills = 1, str = 5;
        MaxNumTasksAssign_2071 a = new MaxNumTasksAssign_2071();
        System.out.println(a.maxTaskAssign(task, workers, pills, str));

    }

    public int maxTaskAssign(int[] tasks, int[] workers, int pills, int strength) {
        int count = 0;
        //Sort workers and tasks
        Arrays.sort(tasks);
        Arrays.sort(workers);
        int i = 0, j = 0;
        while (i < tasks.length && j < workers.length) {
            if (workers[j] < tasks[i]) {
                if (pills > 0 && workers[j] + strength >= tasks[i]) {
                    pills--;
                    count++;
                }
            } else count++;
            i++;
            j++;
        }
        return count;
    }
}
