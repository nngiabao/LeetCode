package Array;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class SortPeople_2418 {
    public String[] sortPeople(String[] names, int[] heights) {
        //using treemap
        TreeMap<Integer,String> map = new TreeMap<>((a, b) -> a.compareTo(b));
        //
        for (int i = 0; i < names.length; i++) {
            map.put(heights[i], names[i]);
        }
        //put back to string
        String [] res = new String[names.length];
        map.forEach((a,b) -> res[a] =b);
        return res;
    }
}
