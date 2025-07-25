package Heap;

import java.util.*;

public class TopKFreqNum_347 {
    //Solution 1:Using Map and PQ
    public int[] topKFrequent(int[] nums, int k) {
        //Build heap to know
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        //
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        int[] res = new int[k];
        //
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        //
        pq.addAll(map.entrySet());
        for (int i = 0; i < k; i++) {
            res[i] = pq.poll().getKey();
        }
        return res;
    }

    //Solution 2:Bucket sort
    public int[] topKFrequent2(int[] nums, int k) {
        //create the map
        Map<Integer, Integer> map = new HashMap<>();
        //
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        //build bucket where index = freq
        List<Integer>[] bucket = new List[nums.length + 1];
        for (int key : map.keySet()) {
            int freq = map.get(key);
            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            //
            bucket[freq].add(key);
        }
        //find top k element we need
        List<Integer> result = new ArrayList<>();
        for (int i = bucket.length - 1; i >= 0 && result.size() < k; i--) {
            if (bucket[i] != null) {
                result.addAll(bucket[i]);
            }
        }
        //
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = result.get(i);
        }
        //
        return res;
    }
}
