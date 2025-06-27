package Backtracking;

import java.util.*;

public class CombinationSum2_40 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        //sort to avoid duplicate element
        Arrays.sort(candidates);
        backtracking(result,new ArrayList<Integer>(),0,target,candidates);
        return result;
    }

    void backtracking(List<List<Integer>> result,List<Integer> tempList, int start,int target,int [] candidates){
        //Base case
        if(target == 0){
            if(!result.contains(tempList)) result.add(new ArrayList<>(tempList));;
            return;
        }
        //
        for(int i=start;i<candidates.length;i++){
            //to avoid duplicate
            if(i > start && candidates[i] == candidates[i-1]) continue;
            if(candidates[i] > target) break;//we dont need to continue
            //add to templist
            tempList.add(candidates[i]);
            //here i+1 to avoid duplicate element
            backtracking(result,tempList,i+1,target - candidates[i],candidates);
            //when hit base case go backward
            tempList.remove(tempList.size()-1);
        }
    }
}
