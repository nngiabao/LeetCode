package Greedy;

import java.util.Arrays;

public class MaxBagsWithFullCapacity_2279 {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        //
        int n = capacity.length;
        //find need[] bag to fill the bag
        int need[] = new int[n];
        for(int i = 0; i < n; i++){
            need[i] = capacity[i]-rocks[i];
        }
        //sort need[] to fill max
        Arrays.sort(need);
        //
        int count = 0;
        for(int i=0;i<n;i++){
            if(need[i] == 0) count++;
            else if (additionalRocks>=need[i]){
                additionalRocks -= need[i];
                count ++;
            }else break;
        }
        return count;
    }
}
