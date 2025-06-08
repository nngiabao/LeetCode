package Array;

import java.util.ArrayList;
import java.util.*;

public class TopKFrequentElements_347 {
    //Solution 1
    public int[] topKFrequent(int[] nums, int k) {
        //
        if(nums.length == 1) return nums;
        //Sort first
        Arrays.sort(nums);
        //then using pointer to find
        int start = 0;
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<nums.length;i++){
            if(nums[i] != nums[i]){
                if(i-start>= k) list.add(nums[i]);
            }
        }
        //edge case
        if(list.size() == 0) return new int[0];
        return list.stream().mapToInt(i->i).toArray();
    }
}
