package Array;

import java.util.Arrays;

public class HeightChecker_1051 {
    //Solution 1: Normal method
    public int heightChecker(int[] heights) {
        //
        //using copied array
        int [] temp = Arrays.copyOf(heights, heights.length);
        Arrays.sort(temp);
        //
        int count=0;
        for(int i=0;i<temp.length;i++){
            if(temp[i] != heights[i]) count++;
        }
        return count;
    }

    //Solution 2:
    public int heightChecker2(int[] heights) {
        return 0;
    }
}
