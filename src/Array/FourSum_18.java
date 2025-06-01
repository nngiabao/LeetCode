package Array;

import java.util.*;

public class FourSum_18 {
    //Solution 1:Using brute force but only for small data set
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<Integer> list = new ArrayList<Integer>();
        HashSet<List<Integer>> res = new HashSet<>();
        //
        int len = nums.length;
        for(int i = 0; i < len; i++){
            for(int j = i+1; j < len; j++){
                for(int k = j+1; k < len; k++){
                    for(int l = k+1; l < len; l++){
                        if(nums[i]+nums[j]+nums[k]+nums[l] == target){
                            list = new ArrayList(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
                            //we have to sort to make it unique
                            Collections.sort(list);
                            res.add(list);
                        }
                    }
                }
            }
        }
        //
        return res.stream().toList();
    }

    //Solution 2:DP
}
