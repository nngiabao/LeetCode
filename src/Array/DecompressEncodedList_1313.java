package Array;

import java.util.*;

public class DecompressEncodedList_1313 {
    public int[] decompressRLElist(int[] nums) {
       //we use array list to deal iwth this
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i < nums.length; i+=2){
            for(int j = 0; j < nums[i-1]; j++){
                list.add(nums[i]);
            }
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}
