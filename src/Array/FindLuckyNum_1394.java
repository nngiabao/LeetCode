package Array;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class FindLuckyNum_1394 {
    public static void main(String[] args) {
        int []c = {2,2,3,4};
        FindLuckyNum_1394 a = new FindLuckyNum_1394();
        System.out.println(a.findLucky(c));
    }
    //Solution 1: Using hash map to find freq => avg
    public int findLucky(int[] arr) {
        //
        if(arr.length == 1) return arr[0];
        //
        int n = arr.length;
        //put into map
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        //check lucky number
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b) -> b-a);
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getKey() == entry.getValue()) pq.offer(entry.getKey());
            //only take the highest
        }
        return pq.poll();
    }
    //Solution 2:put into array ( only if the range is not to big
    public int findLucky2(int[] arr) {
        if(arr.length == 1) return -1;
        //create index array constraint from 1 to 500
        int [] index = new int[501];
        //
        int lucky_num = -1;
        for(int i = 0; i < arr.length; i++) index[i+1]++;
        //check the freq
        for(int i = 1; i < 501; i++){
            if(index[i] == i) lucky_num = Math.max(arr[i], lucky_num);
        }
        return lucky_num;
    }
}
