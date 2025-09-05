package Sorting;

import java.util.Arrays;

public class AvgMinMaxSalary_1491 {
    public double average(int[] salary) {
        Arrays.sort(salary);
        int len = salary.length;
        if(len == 3) return salary[1];
        long sum = 0;
        for(int i = 1; i < len-1; i++){
            sum += salary[i];
        }
        return (double) sum / (len-2);
    }
}
