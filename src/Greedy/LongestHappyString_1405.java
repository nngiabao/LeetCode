package Greedy;

import java.util.*;

//
public class LongestHappyString_1405 {
    public String longestDiverseString(int a, int b, int c) {
        //find max and second max by put in
        int[] cage = new int[3];
        //using array with 2 element
        PriorityQueue<int[]> pq = new PriorityQueue<>((x, y) -> y[0] - x[0]);
        if (a > 0) pq.offer(new int[]{a, 'a'});
        if (b > 0) pq.offer(new int[]{b, 'b'});
        if (c > 0) pq.offer(new int[]{c, 'c'});
        //
        StringBuilder sb = new StringBuilder();
        //
        while (!pq.isEmpty()) {
            int[] first = pq.poll();
            int n = sb.length();
            //avoid this case "xxx"
            if(n >= 2 && first[0] == first[1] && first[1] == first[2] ) {
                if(pq.isEmpty()) break; //nothing to add

                int[] second = pq.poll();
                sb.append()
            }else{
                sb.append((char) first[1]);
                //then add again

            }
        }

        return sb.toString();
    }
}
