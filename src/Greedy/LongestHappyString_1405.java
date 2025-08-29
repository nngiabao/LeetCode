package Greedy;

import java.util.*;

//
public class LongestHappyString_1405 {
    public String longestDiverseString(int a, int b, int c) {
        //using array with 2 element - 1 is for freq 1 is for char
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
            if (n >= 2 && sb.charAt(n-1) == first[1] && first[1] == sb.charAt(n-2)) {
                if (pq.isEmpty()) break; //nothing to add

                int[] second = pq.poll();
                sb.append((char) second[1]);
                //put second back
                second[0]--;
                if(second[0] > 0) pq.offer(second);
                //put first back => next char is first
                pq.offer(first);
            } else {
                sb.append((char) first[1]);
                //then add again if freq > 0
                first[0]--;
                if (first[0] > 0) pq.offer(first);
            }
        }
        return sb.toString();
    }
}
