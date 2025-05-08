package Array;

import java.util.Arrays;
import java.util.HashSet;

public class NumberDistinctAverages_2465 {
    public static void main(String[] args) {
        NumberDistinctAverages_2465 a = new NumberDistinctAverages_2465();
        int [] c =  {9,5,7,8,7,9,8,2,0,7};
        a.distinctAverages(c);
    }
    public int distinctAverages(int[] nums) {
        //edge case
        if(nums.length == 2) return 1;
        HashSet<Double> set = new HashSet<Double>();
        Arrays.sort(nums);
        //
        int len = nums.length;
        int i=0, j=len-1;
        while(i<j){
            set.add((double) ((nums[i++]+nums[j--])/2.0));
        }
        //sorted array
        return set.size();
    }
}
