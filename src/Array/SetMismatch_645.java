package Array;

import java.util.HashSet;
import java.util.Set;

public class SetMismatch_645 {
    public static void main(String[] args) {

    }

    public int[] findErrorNums(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != i+1){
                set.add(nums[i]);
                set.add(i+1);
            }
        }
        return set.stream().mapToInt(i->i).toArray();
    }
}
