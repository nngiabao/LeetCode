package Array;

import java.util.HashSet;

public class SingleNum3_260 {
    public int[] singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int num : nums){
            if(set.contains(num)) set.remove(num);
        }

        return set.stream().mapToInt(i->i).toArray();
    }
}
