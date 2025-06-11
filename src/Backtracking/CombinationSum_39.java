package Backtracking;

import java.util.*;

public class CombinationSum_39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();

        backtrack(result, new ArrayList<>(), candidates, target,0);
        return result;
    }

    //start parameter here is avoid duplicate
    //because we start from index: 0
    public void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] candidates, int target,int start){
        //base case
        if(target == 0){
            result.add(new ArrayList<>(tempList));
            return;
        }
        //
        for(int i=start;i<candidates.length;i++){
            if(candidates[i] > target) continue;
            tempList.add(candidates[i]);
            backtrack(result, tempList, candidates, target - candidates[i],i);
            tempList.remove(tempList.size()-1);
        }
    }
}
