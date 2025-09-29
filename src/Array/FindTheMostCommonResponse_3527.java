package Array;
import java.util.*;

public class FindTheMostCommonResponse_3527 {
    public String findCommonResponse(List<List<String>> responses) {
        Map<String, Integer> map = new HashMap<>();
        for(List<String> list : responses) {
            Set<String> set = new HashSet<>(list);
            for(String s : list){
                 set.add(s);
            }
            //put into the map
            for(String s : set){
                map.put(s, map.getOrDefault(s, 0) + 1);
            }
        }
        //sort by list and using lambda
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        list.sort((a, b) -> {
            int freq = b.getValue().compareTo(a.getValue()); // higher freq first
            if (freq == 0) {
                return a.getKey().compareTo(b.getKey()); // tie → alphabetical
            }
            return freq;
        });
        return list.get(0).getKey();
    }
}
