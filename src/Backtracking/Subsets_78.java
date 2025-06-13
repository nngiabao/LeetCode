package Backtracking;

import java.util.*;
public class Subsets_78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        backtrack(result, new ArrayList<>(), nums, 0);
        return result;
    }
    //
    public void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums, int start){
        //base case
        if(start == nums.length){
            return;
        }
        //
        for(int i=start;i<nums.length;i++){
            int num = nums[i];
            tempList.add(num);
            result.add(new ArrayList<>(tempList));
            backtrack(result, tempList, nums, i+1);
            tempList.remove(tempList.size()-1);
        }
    }
}
