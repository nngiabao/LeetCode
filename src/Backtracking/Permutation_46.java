package Backtracking;

import java.util.*;
public class Permutation_46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums.length == 0) return result;
        backtrack(result, new ArrayList<>(), nums);
        return result;
    }

    void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums){
        //base case
        if(tempList.size() == nums.length){
            result.add(new ArrayList<>(tempList));
            return;
        }
        //current digit
        //keep going until hit base case
        for(int num : nums){
            if(tempList.contains(num)) continue;
            tempList.add(num);
            backtrack(result, tempList, nums);
            tempList.remove(tempList.size()-1);
        }
    }
}
