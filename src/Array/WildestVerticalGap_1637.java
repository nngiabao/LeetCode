package Array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class WildestVerticalGap_1637 {
    public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points,(a,b)->a[0]-b[0]);
        //
        int max =0;
        for(int i=1;i<points.length;i++){
            max=Math.max(max,points[i][0]-points[i-1][0]);
        }
        return max;
    }
    //Solution 2:

}
