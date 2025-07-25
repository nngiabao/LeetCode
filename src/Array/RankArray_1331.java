package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RankArray_1331 {
    //Solution 1:
    public int[] arrayRankTransform(int[] arr) {
        //copy and sort
        int [] copy =  Arrays.copyOf(arr, arr.length);
        Arrays.sort(copy);
        //using hash map
        int rank = 1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : copy) {
            if (!map.containsKey(num)) map.put(num,rank++);
        }
        //put into array
        for(int i=0;i<arr.length;i++) {
            arr[i] = map.get(arr[i]);
        }
        //
        return arr;
    }
    //Solution 2:
}
