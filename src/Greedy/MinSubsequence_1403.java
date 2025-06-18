package Greedy;

import java.util.*;
public class MinSubsequence_1403 {
    public List<Integer> minSubsequence(int[] nums) {
        List<Integer> result = new ArrayList<>();
        //keep pick selectSum > totalSum - selectSum
        Arrays.sort(nums);
        //find totalSUm
        int totalSum = 0;
        for(int num : nums){
            totalSum += num;
        }
        int selectedSum = 0;
        //
        for(int i = nums.length-1; i >= 0; i--){
            selectedSum+= nums[i];
            result.add(nums[i]);
            if(selectedSum > totalSum - selectedSum) return result;
        }
        return result;
    }
}
