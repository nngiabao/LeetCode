package Sorting;

import java.util.*;
import java.util.Arrays;

public class MaxSumOfKDigit_3684 {
    public int[] maxKDistinct(int[] nums, int k) {
        //
        int len = nums.length;
        if(len == 1) return nums;
        Arrays.sort(nums);
        //

        int index = nums.length - 2;
        int start = nums.length - 1;
        List<Integer> list = new ArrayList<>();
        list.add(nums[start]);
        int i=1;
        while(index > 0 && i < k){
            if(nums[index] != nums[start]){
                list.add(nums[index]);
                start = index;
                i++;
            }
            index--;
        }
        //put into res
        int[] res = new int[list.size()];
        for(int j=0;j<res.length;j++){
            res[j] = list.get(j);
        }
        return res;
    }
}
