package Sorting;

import java.util.*;
//
public class MajorityElementII_229 {
    //Solution 1:Sort
    public List<Integer> majorityElement2(int[] nums) {
        List<Integer> result = new ArrayList<>();
        Arrays.sort(nums);
        //
        int n = nums.length;
        int threshold = n / 3;
        int count = 1;

        for (int i = 1; i <= n; i++) {
            if (i < n && nums[i] == nums[i - 1]) {
                count++;
            } else {
                if (count > threshold) {
                    result.add(nums[i - 1]);
                }
                count = 1;
            }
        }
        return result;
    }
    //Solution 2:Using hashmap
    public List<Integer> majorityElement(int[] nums) {
        //
        List<Integer> res = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        //put into the array list
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        //Count
        for(int key : map.keySet()){
            if(map.get(key) > n/3) res.add(key);
        }
        return res;
    }
    //Solution 3:Boyer-More
    public List<Integer> majorityElement3(int[] nums) {
        Integer cand1 = null, cand2 = null;
        int count1 = 0, count2 = 0;

        for (int num : nums) {
            if (Objects.equals(cand1, num)) count1++;
            else if (Objects.equals(cand2, num)) count2++;
            else if (count1 == 0) { cand1 = num; count1 = 1; }
            else if (count2 == 0) { cand2 = num; count2 = 1; }
            else { count1--; count2--; }
        }

        // Verify
        count1 = 0; count2 = 0;
        for (int num : nums) {
            if (Objects.equals(cand1, num)) count1++;
            else if (Objects.equals(cand2, num)) count2++;
        }

        List<Integer> result = new ArrayList<>();
        if (count1 > nums.length / 3) result.add(cand1);
        if (count2 > nums.length / 3) result.add(cand2);

        return result;
    }

}
