package Array;

import java.util.HashSet;
import java.util.Set;

public class FindDistinctDiffArray_2670 {
    public int[] distinctDifferenceArray(int[] nums) {
        //
        int n = nums.length;
        if(n == 1) return new int[]{1};
        Set<Integer> prefix = new HashSet<>();
        //
        //find the distinct
        int[] res = new int[n];
        for(int i = 0; i < n; i++) {
            prefix.add(nums[i]);
            //find the suffix
            Set<Integer> suffix = new HashSet<>();
            for(int j = i+1; j < n; j++) {
                suffix.add(nums[j]);
            }
            res[i] = prefix.size() - suffix.size();
        }
        return res;
    }
}
