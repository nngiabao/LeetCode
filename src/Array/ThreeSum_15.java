package Array;

import java.util.*;

public class ThreeSum_15 {
    public static void main(String[] args) {
        ThreeSum_15 a = new ThreeSum_15();
        int[] t = {-1, 0, 1, 2, -1, -4};
        System.out.println(a.threeSum(t));

    }

    //Solution 1: Brute-force - fails some testcases
    public List<List<Integer>> threeSum(int[] nums) {
        List<Integer> triplet = new ArrayList<>();
        HashSet<List<Integer>> res = new HashSet<>();
        //Using 3 loops
        int len = nums.length;
        for (int i = 0; i < len-2; i++) {
            for (int j = i + 1; j < len-1; j++) {
                for (int k = j+1; k < len; k++) {
                    if (nums[i]+nums[j]+nums[k] == 0) {
                        triplet = new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k]));
                        Collections.sort(triplet);//get unique array
                        res.add(triplet);
                    }
                }
            }
        }
        return new ArrayList<>(res);
    }

    //Solution 2:


}
