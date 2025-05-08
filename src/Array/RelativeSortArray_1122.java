package Array;

import java.util.*;

public class RelativeSortArray_1122 {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        //sort array 1 first
        //convert array 1 to list => we can make it dynamic
        //build map of arr1
        Map<Integer,Integer> map = new TreeMap<>();
        for(int i = 0; i < arr1.length; i++){
            map.put(arr1[i], map.getOrDefault(arr1[i], 0) + 1);
        }
        //put into arr2 order
        int [] res  = new int[arr1.length];
        int index=0;
        for(int i = 0; i < arr2.length; i++){
            int count = map.get(arr2[i]);
            for(int j = 0; j < count; j++){
                res[index++] = arr2[i];
            }
            map.remove(arr2[i]);
        }
        //put the rest

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int count = entry.getValue();
            for(int j = 0; j < count; j++){
                res[index++] = entry.getKey();
            }
        }
        return res;
    }
}
