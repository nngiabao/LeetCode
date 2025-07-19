package Array;

import java.util.Arrays;

public class AvgSmallestLargest_3194 {
    public double minimumAverage(int[] nums) {
        double min = Integer.MAX_VALUE;
        //sort then use 2 pointers
        int i=0,j=nums.length-1;
        Arrays.sort(nums);
        //
        while(i<j) {
            min = Math.min(min,(double)(nums[i]+nums[j])/2);
            i++;
            j--;
        }
        //
        return min;
    }
}
