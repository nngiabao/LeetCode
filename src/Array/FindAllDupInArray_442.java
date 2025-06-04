package Array;

import java.util.*;
public class FindAllDupInArray_442 {
    public List<Integer> findDuplicates(int[] nums) {
        //
        List<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        //
        for(int num : nums){
            if(!set.add(num)) list.add(num);
        }
        return list;
    }
}
