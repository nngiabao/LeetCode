package SlidingWindow;

import java.util.*;

public class FindXSumSubarraysI {
    public int[] findXSum(int[] nums, int k, int x) {
        //using hashtable to count freq
        if(nums.length == 1) return nums;
        TreeMap<Integer, Integer> freq = new TreeMap<>();


        //count slide window first and count the freq too
        int sum=0,max=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
            max=Math.max(max,freq.get(nums[i]));
        }
        //result answer[] where length n - k + 1
        //result array
        int length = nums.length-k+1;
        int[] res = new int[length];
        for (int i=0;i<length;i++){
            //check freq in that slide window
            int count = 0;
            if(freq.size() < x) res[i] = sum;
            for(Map.Entry<Integer, Integer> entry : freq.entrySet()){
                if(count==x) break;
            }
            //

            sum=sum+nums[i]-nums[i-k];
        }
        //
        return null;
    }
    //find top element in slide window

}
