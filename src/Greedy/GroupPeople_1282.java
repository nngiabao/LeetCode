package Greedy;

import java.util.*;

public class GroupPeople_1282 {
    //Solution 1:
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        //
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        List<List<Integer>> result = new ArrayList<>();
        //put into map
        int len = groupSizes.length;
        for (int i = 0; i < len; i++) {
            int cap = groupSizes[i];
            //put if absent
            map.putIfAbsent(cap, new ArrayList<>());
            map.get(cap).add(i);

            //if full add to result
            List<Integer> temp = map.get(cap);
            if (temp.size() == cap) {
                //list tem
                result.add(new ArrayList<>(temp));
                temp.clear();
            }
        }
        return result;
    }
}

