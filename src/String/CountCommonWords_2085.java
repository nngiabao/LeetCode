package String;

import java.util.*;

public class CountCommonWords_2085 {
    public int countWords(String[] words1, String[] words2) {
        int count = 0;
        //put into hash map first
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        for (String w : words1) {
            map1.put(w, map1.getOrDefault(w, 0) + 1);
        }
        //
        for (String w : words2) {
            map2.put(w, map2.getOrDefault(w, 0) + 1);
        }
        //count
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map1.entrySet()) {
            if (entry.getValue() == 1) list.add(entry.getKey());
        }
        //
        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            if (list.contains(entry.getKey()) && entry.getValue() == 1) count++;
        }
        //
        return count;
    }

    //Solution 2:Optimized
    public int countWords2(String[] words1, String[] words2) {
        HashMap<String, Integer> num = new HashMap<>();

        for (String w : words1) {
            num.put(w, num.getOrDefault(w, 0) + 1);
        }


        for (String w : words2) {
            if (num.containsKey(w)) {
                if (num.get(w) == 1) {
                    num.put(w, 0);
                } else {
                    num.put(w, -1);
                }
            }
        }

        int count = 0;
        for (int v : num.values()) {
            if (v == 0) count++;
        }
        return count;

    }
}
