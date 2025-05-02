package Array;

import java.util.Arrays;

public class CountElements_2148 {
    public int countElements(int[] nums) {
        //using stream
        int max = Arrays.stream(nums).max().getAsInt();
        int min = Arrays.stream(nums).min().getAsInt();
        //
        int count=0;
        for(int i = 0; i <= nums.length; i++){
            if(nums[i]> min && nums[i]<max){
                count++;
            }
        }

        return count;
    }
}
