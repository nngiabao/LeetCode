package Sorting;

import java.util.*;
import java.util.PrimitiveIterator;
import java.util.PriorityQueue;

public class LeastNumUniqueKRemoval_1481 {
    public static void main(String[] args) {
        LeastNumUniqueKRemoval_1481 a= new LeastNumUniqueKRemoval_1481();
        int[] c = {
            4, 3, 1, 1, 3, 3, 2
        };
        a.findLeastNumOfUniqueInts(c,3);
    }
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        //Using HashMap => then sort
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        //using pq to sort the value
        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>(Map.Entry.comparingByValue());
        pq.addAll(map.entrySet());
        //
        while(!pq.isEmpty() && k > 0) {
            Map.Entry<Integer,Integer> entry = pq.peek();
            if(k-entry.getValue() >=0) k-= entry.getValue();
            else break;
            pq.poll();
        }
        return pq.size();
    }
    //Solution 2: Optimize
    public int findLeastNumOfUniqueInts3(int[] arr, int k) {
        // Step 1: Count frequencies
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        // Step 2: Put frequencies in a list
        List<Integer> freqs = new ArrayList<>(map.values());
        Collections.sort(freqs); // ascending order

        // Step 3: Remove as many as possible
        int unique = freqs.size();
        for (int f : freqs) {
            if (k >= f) {
                k -= f;
                unique--; // completely removed this number
            } else {
                break;
            }
        }
        return unique;
    }

}
