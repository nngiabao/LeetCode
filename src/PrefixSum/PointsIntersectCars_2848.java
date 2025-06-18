package PrefixSum;

import java.util.*;
public class PointsIntersectCars_2848 {
    public int numberOfPoints(List<List<Integer>> nums) {
        //
        int[] presum = new int[102];
        for(List<Integer> num : nums){
            presum[num.get(0)]++;
            presum[num.get(1)+1]--;
        }
        //
        int count=0;
        int currentSum=0;
        for(int i=1;i<=101;i++){
            currentSum+=presum[i];
            if(currentSum>0) count++;
        }
        return count;
    }
}
