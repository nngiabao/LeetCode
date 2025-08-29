package Sorting;

import java.util.Arrays;
import java.util.HashMap;

public class ReduceArraySize_1338 {
    public int minSetSize(int[] arr) {
        //put into hashmap
        int n = arr.length;
        int count = 0;
        //
        if (n == 2) return 1;
        //
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        //create the array to store the value
        int [] values = new int[map.size()];
        //put into the array
        int i =0;
        for(int num : map.values()){
            values[i++] = num;
        }
        //
        Arrays.sort(values);
        int sum =0;
        for(int j = values.length-1;j>=0;j--){
            sum += values[j];
            count++;
            if(sum > n/2) return count;
        }
        //
        return count;
    }
}
