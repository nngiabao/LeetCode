package Greedy;

import java.util.PriorityQueue;

public class MinNumbersPushes_3016 {
    public static void main(String[] args) {
        MinNumbersPushes_3016 a = new MinNumbersPushes_3016();
        a.minimumPushes("alporfmdqsbhncwyu");
    }
    //Solution 1:Greedy
    public int minimumPushes(String word) {
        //because every we have 8 digits and each characters unique
        //distribute equally
        //=> minimize the freq => use decreasing freq
        int[] dict = new int[26];
        //
        for(char c : word.toCharArray()){
            dict[c - 'a']++;
        }
        //put int pq to sort highest freq first
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);
        //
        for(int freq : dict){
            if(freq > 0) pq.add(freq);
        }
        //count pushes
        int index=0;
        int count=0;
        while(!pq.isEmpty()){
            int freq = pq.poll();
            count += freq*(index/8+1);
            index++;
        }
        return count;
    }
}
