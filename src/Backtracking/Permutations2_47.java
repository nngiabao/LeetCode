package Backtracking;

import java.util.*;
public class Permutations2_47 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        //we need a tracking array to track used element
        //we need to sort => avoid duplicate
        Arrays.sort(nums);
        boolean[] usedArray = new boolean[nums.length];
        backtrack(result, new ArrayList<>(), nums,usedArray);
        return result;
    }

    //no need start index cuz this one dont need to be order
    void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums,boolean[] isUsed){
        //base case
        if(tempList.size() == nums.length){
            result.add(new ArrayList<>(tempList));
            return;
        }
        //
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i] == nums[i-1] && !isUsed[i-1]) continue;
            isUsed[i] = true;
            tempList.add(nums[i]);
            backtrack(result, tempList, nums,isUsed);
            tempList.remove(tempList.size()-1);
            isUsed[i] = false;
        }
    }
}
