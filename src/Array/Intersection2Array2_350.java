package Array;

import java.util.ArrayList;
import java.util.HashMap;

public class Intersection2Array2_350 {
    //using hash map
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> result = new ArrayList<>();
        //put nums1 into hashmap
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i], map.getOrDefault(nums1[i], 0) + 1);
        }
        //check nums2
        for (int i = 0; i < nums2.length; i++) {
            if(map.containsKey(nums2[i]) && map.get(nums2[i]) > 0) {
                map.put(nums2[i], map.get(nums2[i]) - 1);
                result.add(nums2[i]);
            }
        }
        //using stream to convert
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
