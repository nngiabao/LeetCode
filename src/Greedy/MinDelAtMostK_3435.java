package Greedy;

import java.util.*;

//
public class MinDelAtMostK_3435 {
    public int minDeletion(String s, int k) {
        //dict
        int[] dict = new int[26];
        //put int hash map
        for (Character c : s.toCharArray()) {
            dict[c - 'a']++;
        }
        //sort and remove char has most freq
        Arrays.sort(dict);
        //
        int count=0;
        for(int i=25;i>=0;i--){
            if(dict[i]>0){
                if(k ==0){
                    count+=dict[i];
                }else{
                    k--;
                }
            }
        }
        //
        return count;
    }
}
