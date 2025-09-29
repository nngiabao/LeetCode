package String;

import java.util.*;
public class NumbersOfPairs_2023 {
    //Solution 1:Using 2 loops => Brute-force
    public int numOfPairs(String[] nums, String target) {
        //
        int count = 0;
        int n = nums.length;
        int t_len = target.length();
        for (int i = 0; i < n - 1; i++) {
            int len = nums[i].length();
            for (int j = i + 1; j < n; j++) {
                if(t_len-len != nums[j].length()) continue;
                if((nums[i]+nums[j]).equals(target)) count++;
                if((nums[j]+nums[i]).equals(target)) count++;
            }
        }
        //
        return count;
    }
    //Solution 2: Using hashmap to store prefix and suffix
    public int numOfPairs2(String[] nums, String target) {
        Map<String, Integer> map = new HashMap<>();
        int count=0;
        int n = nums.length;
        //store the freq
        for(String num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        //check tge suffix
        for(String num : nums) {
            if(target.startsWith(num)){
                String suffix = target.substring(num.length());
                if(map.containsKey(suffix)){
                    count+=map.get(suffix); //because it might be duplicate
                    //avoid a pair (i,i)
                    if(suffix.equals(num)){
                        count--;
                    }
                }
            };
        }
        return count;
    }
}
