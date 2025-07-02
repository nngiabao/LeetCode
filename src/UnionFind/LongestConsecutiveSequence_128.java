package UnionFind;

import java.util.HashSet;

public class LongestConsecutiveSequence_128 {
    //Solution 1:Using hashset
    //not avaiable for large input
    public int longestConsecutive(int[] nums) {
        //
        HashSet<Integer> set = new HashSet<>();
        int max=0;
        //add to hash set
        for(int num : nums){
            set.add(num);
        }
        //

         //
        for(int num : nums) {
            //Only start counting if nums is the start of a sequence
            if(!set.contains(num-1)) {
                int count = 1;
                while(set.contains(num+1)) {
                    count++;
                    num++;
                }
                max = Math.max(max, count);
            }
        }
        return max;
    }
}
