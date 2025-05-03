package Array;

import java.util.HashMap;
import java.util.Map;

public class MostFreqNum_2190 {
    public int mostFrequent(int[] nums, int key) {
        //table store
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i] == key && i != nums.length-1)
                map.put(nums[1],map.getOrDefault(nums[1],0) + 1);
        }
        //Dictionary
        int max = 0,result = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > max){
                max = entry.getValue();
                result = entry.getKey();
            }
        }
        //
        return result;
    }
}
