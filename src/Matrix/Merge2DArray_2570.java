package Matrix;

import java.util.HashMap;
import java.util.Map;

public class Merge2DArray_2570 {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {

        //using hashmap
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums1.length; i++){
            if(map.containsKey(nums1[i][0])){
                map.put(nums1[i][0],map.get(nums1[i][0])+nums1[i][1]);
            }else map.put(nums1[i][0],nums1[i][1]);
        }
        //
        for(int i = 0; i < nums2.length; i++){
            if(map.containsKey(nums2[i][0])){
                map.put(nums2[i][0],map.get(nums2[i][0])+nums2[i][1]);
            }else map.put(nums2[i][0],nums2[i][1]);
        }
        int [][] res = new int[map.size()][2];
        int index = 0;
        //
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            res[index][0] = map.get(entry.getKey());
            res[index][1] = entry.getValue();
            index++;
        }
        //
        return res;
    }
}
