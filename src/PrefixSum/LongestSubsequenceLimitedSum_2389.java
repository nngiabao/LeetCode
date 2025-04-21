package PrefixSum;

import java.util.*;

public class LongestSubsequenceLimitedSum_2389 {
    //Solution 1:
    public int[] answerQueries(int[] nums, int[] queries) {
        //sorting first due to some element for some cases
        Arrays.sort(nums);
        //create sum prefix array to compare to queries
        int [] presum = new int[nums.length];
        presum[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            presum[i] = presum[i-1] + nums[i];
        }
        //create the array list array - cuz we dont know
        List<Integer> res = new ArrayList<>();
        //using BST the find how many elements need
        //
        for(int i = 0; i < queries.length; i++){
            res.add(search(presum, queries[i])+1);
        }
        return res.stream().mapToInt(i->i).toArray();
    }

    //BST method
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length-1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return right;
    }
    //Solution 2: optimize code from solution 1
}
