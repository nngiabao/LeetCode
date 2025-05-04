package String;

import java.util.*;
public class UncommonWords_884 {
    //Solution 1:
    public String[] uncommonFromSentences(String s1, String s2) {
        //split to find word
        String[] s1_array = s1.split(" ");
        String[] s2_array = s2.split(" ");
        //hashmap
        HashMap<String, Integer> map_1 = new HashMap<>();
        HashMap<String, Integer> map_2 = new HashMap<>();
        //put s1 array into map
        for(int i = 0; i < s1_array.length; i++) {
            map_1.put(s1_array[i],map_1.getOrDefault(s1_array[i],0)+1);
        }
        //put s2 array into map
        for(int i = 0; i < s2_array.length; i++) {
            map_2.put(s2_array[i],map_2.getOrDefault(s2_array[i],0)+1);
        }
        //find unique fist dictionary
        List<String> res = new ArrayList<>();
        for(Map.Entry<String, Integer> entry : map_1.entrySet()) {
            String key = entry.getKey();
            int val = entry.getValue();
            if(val == 1 && !map_2.containsKey(key)) res.add(key);
        }
        //find unique second dictionary
        for(Map.Entry<String, Integer> entry : map_2.entrySet()) {
            String key = entry.getKey();
            int val = entry.getValue();
            if(val == 1 && !map_1.containsKey(key)) res.add(key);
        }
       return res.toArray(new String[res.size()]);
    }
}
