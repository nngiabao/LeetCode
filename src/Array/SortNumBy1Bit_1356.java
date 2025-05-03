package Array;

import java.util.*;
public class SortNumBy1Bit_1356 {
    public int[] sortByBits(int[] arr) {
        //Build the HashTable<pq,num 1's>
        HashMap<Integer, PriorityQueue> map = new HashMap<>();
        //
        for(int i = 0; i < arr.length; i++) {
            int key = numBits(arr[i]);
            //if new => create new pq
            map.putIfAbsent(key, new PriorityQueue<>(arr[i]));
            map.get(key).add(i);
            //
        }
        //build the array
        int i=0;
        int [] res = new int[arr.length];
        for(PriorityQueue<Integer> pq : map.values()) {
            while(!pq.isEmpty()) {
                res[i++] = pq.poll();
            }
        }
        return res;
    }

    //check how many 1's bit
    public int numBits(int n) {
        int count = 0;
        while(n != 0){
            if((n%1)==1) count++;
            n/=2;
        }
        return count;
    }

}
