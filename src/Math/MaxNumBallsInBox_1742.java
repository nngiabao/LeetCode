package Math;

import java.util.*;

public class MaxNumBallsInBox_1742 {
    //Solution 1:Using hash map
    public int countBalls(int lowLimit, int highLimit) {
        //
        HashMap<Integer, Integer> map = new HashMap<>();
        ///
        for(int i = lowLimit; i <= highLimit; i++) {
            int box = returnBox(i);
            map.put(box, map.getOrDefault(box, 0) + 1);
        }
        //
         //find max
        int max =0;
        for(int value : map.values()){
            max = Math.max(max, value);
        }
        return max;
    }
    //method to idenfity which box
    int returnBox(int n){
        int res = 0;
        while(n > 0){
            res+= n%10;
            n/=10;
        }
        return res;
    }
}
