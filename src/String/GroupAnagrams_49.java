package String;

import java.util.*;

//
public class GroupAnagrams_49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            //convert to char array to sort
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            //1 line lambda
            map.computeIfAbsent(sorted, k -> new ArrayList<>()).add(str);
            //its like this
            /* if(map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(str);
            * */
            //
        }
        //return the result
        List<List<String>> res = new ArrayList<>();
        for(List<String> list : map.values()) {
            res.add(list);
        }
        return res;
    }
}
