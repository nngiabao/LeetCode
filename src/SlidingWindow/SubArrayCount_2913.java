package SlidingWindow;

import java.util.*;

//
public class SubArrayCount_2913 {
    public int sumCounts(List<Integer> nums) {
        int sum = 0;
        if(nums.size() == 1) return 1;
        //
        for(int i=0;i<nums.size();i++){
            HashSet<Integer> set = new HashSet<>();
            //
            int j=i;
            while(j<nums.size()){
                set.add(nums.get(j));
                sum+= Math.pow(set.size(),2);
                j++;
            }
        }
        ///
        return sum;
    }
}
