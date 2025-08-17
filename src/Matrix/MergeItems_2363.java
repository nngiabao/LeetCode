package Matrix;

import java.util.*;

public class MergeItems_2363 {
    //SOlution 1:Using TreeMap
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        List<List<Integer>> res = new ArrayList<>();
        //
        TreeMap<Integer, Integer> map = new TreeMap<>();
        //push item 1
        for(int[] num : items1){
            map.put(num[0], map.getOrDefault(num[0], 0) + num[1]);
        }
        //push item 2
        for(int[] num : items2){
            map.put(num[0], map.getOrDefault(num[0], 0) + num[1]);
        }
        //push back
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            List<Integer> list = new ArrayList<>();
            list.add(entry.getKey());
            list.add(entry.getValue());
            res.add(list);
        }
        return res;
    }
    //Solution 2:Using cage
    public List<List<Integer>> mergeSimilarItems2(int[][] items1, int[][] items2) {
        List<List<Integer>> res = new ArrayList<>();
        //put into cage
        int[] weight = new int[1001];
        //
        for(int i = 0; i < items1.length; i++){
            int value = items1[i][0];
            int weightValue = items1[i][1];
            //
            weight[value] += weightValue;
        }
        //
        for(int i = 0; i < items2.length; i++){
            int value = items1[i][0];
            int weightValue = items1[i][1];
            //
            weight[value] += weightValue;
        }
        //put into
        for(int i = 0; i < 1001; i++){
            List<Integer> list = new ArrayList<>();
            if(weight[i] > 0){
                res.add(Arrays.asList(i, weight[i]));
            }
            //
        }
        return res;
    }
}
