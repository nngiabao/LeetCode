package Array;

import java.util.*;
public class SeperateDigitsArray_2553 {
    public int[] separateDigits(int[] nums) {
        List<Integer> result = new ArrayList();
        for(int i=0;i<nums.length;i++){
            String temp = ""+nums[i];
            int index=0;
            while(index < temp.length()){
                result.add(temp.charAt(index) - '0');
                index++;
            }
        }
        //put into result
        int[] a_result = new int[result.size()];
        for(int i=0;i<a_result.length;i++){
            a_result[i] = result.get(i);
        }
        //
        return a_result;
    }
}
