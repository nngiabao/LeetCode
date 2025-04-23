package PrefixSum;

import java.util.*;

public class MinimumPositiveSumSubarray_3364 {
    public static void main(String[] args) {
        MinimumPositiveSumSubarray_3364 a = new MinimumPositiveSumSubarray_3364();
        List<Integer> nums = Arrays.asList(3, -2, 1, 4);
        int l=2,r=3;
        System.out.println(a.minimumSumSubarray(nums,l,r));
    }
    //Solution 1
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        //edge
        if (nums.size() == 1) return nums.get(0);
        //presum array
        int[] presum = new int[nums.size()];
        presum[0] = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            presum[i] = presum[i - 1] + nums.get(i);
        }
        //check sub array
        int min = Integer.MAX_VALUE, i = nums.size()-1, temp;
        while (l<=r) {
            while(i-l+1>=0){
                int left = i-l+1;
                if (left == 0) temp = presum[i];
                else temp = presum[i] - presum[left-1];
                if (temp > 0) min = Math.min(min, temp);
                i--;
            }
            l++;
            i = nums.size()-1;
        }
        return (min == Integer.MAX_VALUE) ? -1 : min;
    }
}
