package Quest.Array2;

import java.util.Arrays;

public class Q1_SetMismatch {
    public int[] findErrorNums(int[] nums) {
        //sort then compare
        Arrays.sort(nums);
        int bit = 0;
        for(int i = 1; i <= nums.length; i++){
            if(i != nums[i-1]) return new int[]{nums[i-1],i};
        }
        return null;
    }
}
