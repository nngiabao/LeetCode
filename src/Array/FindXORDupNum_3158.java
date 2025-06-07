package Array;

import java.util.HashSet;

public class FindXORDupNum_3158 {
    public int duplicateNumbersXOR(int[] nums) {
        HashSet<Integer> dup = new HashSet<Integer>();
        int result = 0;
        for(int num : nums){
            if(!dup.add(num)){
                result ^= num;
            }
        }
        return result;
    }
}
