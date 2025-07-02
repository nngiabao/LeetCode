package String;

import java.util.HashSet;

public class KthDistinctString_2053 {
    public static void main(String[] args) {
        String[] arr = {"d","b","c","b","c","a"};
        KthDistinctString_2053 a = new KthDistinctString_2053();
        System.out.println(a.kthDistinct(arr,2));
    }
    public String kthDistinct(String[] arr, int k) {
        //put into hashset if
        //if not contains => put in
        //if yes => skip
        //brute-force
        //
        HashSet<String> set = new HashSet<>();
        HashSet<String> duplicate = new HashSet<>();
        ///
        for(String s : arr){
            if(!set.contains(s)) set.add(s);
            else duplicate.add(s);
        }
        //
        int i=1;
        for(String s : arr){
            if(!duplicate.contains(s)) i++;
            if(i==k) return s;
        }
        return "";
    }
}
