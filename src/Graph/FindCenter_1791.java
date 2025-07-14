package Graph;

import java.util.HashMap;
import java.util.Map;

public class FindCenter_1791 {
    //SOlution 1:Using hashmap
    public int findCenter2(int[][] edges) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int[] edge : edges) {
            map.put(edge[1], map.getOrDefault(edge[1], 0) + 1);
            map.put(edge[0], map.getOrDefault(edge[0], 0) + 1);
        }
        int n = edges.length;
        for(int key : map.keySet()) {
            if(map.get(key) == n) return key;
        }
        return -1;
    }
    //Solution 2: Using array
    public int findCenter(int[][] edges) {
        int[] point = new int[edges.length + 1];
        for (int[] edge : edges) {
            for (int i : edge) {
                point[i - 1]++;
                if(point[i - 1] > 1){
                    return i;
                }
            }
        }
        return 0;
    }
}

