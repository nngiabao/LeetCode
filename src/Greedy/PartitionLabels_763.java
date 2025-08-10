package Greedy;

import java.util.*;
//
public class PartitionLabels_763 {
    //Solution 1:Using map
    public List<Integer> partitionLabels(String s) {
        int n = s.length();
        List<Integer> res = new ArrayList<>();
        Map<Character, Integer> last = new HashMap<>();

        for (int i = 0; i < n; i++) last.put(s.charAt(i), i);

        int start = 0, end = 0;
        for (int i = 0; i < n; i++) {
            end = Math.max(end, last.get(s.charAt(i)));
            if (i == end) {
                res.add(end - start + 1);
                start = i + 1;
            }
        }
        return res;
    }
    //Solution 2:Using array
    public List<Integer> partitionLabels2(String s) {
        List<Integer> res = new ArrayList<>();
        int n = s.length();
        //build the last occurence array
        int[] dict = new int[26];

        for(int i = 0; i < n; i++){
            dict[s.charAt(i) - 'a'] = s.lastIndexOf(s.charAt(i));
        }
        //find the last
        int start = 0, end = 0;
        for(int i = 0; i < n; i++){
            end = Math.max(end, dict[s.charAt(i) - 'a']);
            if(i == end) {
                res.add(end - start + 1);
                start = i + 1;
            }
        }
        return res;
    }
}
