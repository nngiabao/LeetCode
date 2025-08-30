package Sorting;

import java.util.Arrays;

public class AppleRedistribution_3025 {
    public int minimumBoxes(int[] apple, int[] capacity) {
        //
        Arrays.sort(capacity);
        //total apple
        int total = 0;
        for (int num : apple) {
            total += num;
        }
        //
        int count=0;
        for(int i = capacity.length - 1; i >= 0; i--) {
            count++;
            total -= capacity[i];
            if(total <= 0) return count;
        }
        //
        return count;
    }
}
