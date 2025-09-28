package PracticeQuestionForContest;

import java.util.*;
public class MajorityFreqChar {
    public String majorityFrequencyGroup(String s) {
        //build dict
        int[] freq = new int[26];
        for(char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        //using hash map
        Map<Integer,List<Character>> map = new HashMap<>();
        for(int i=0;i<26;i++){
            if (freq[i] == 0) continue;
            if(!map.containsKey(freq[i])){
                map.put(freq[i],new ArrayList<>());
            }
            map.get(freq[i]).add((char)(i+'a'));
        }
        //find the res
        int maxK = -1;
        int maxSize = -1;

        for (Map.Entry<Integer, List<Character>> entry : map.entrySet()) {
            int k = entry.getKey();
            int size = entry.getValue().size();

            if (size > maxSize || (size == maxSize && k > maxK)) {
                maxSize = size;
                maxK = k;
            }
        }
        //return res
        StringBuilder sb = new StringBuilder();
        List<Character> res = map.get(maxK);
        for(Character c : res){
            sb.append(c);
        }
        return sb.toString();
    }
}
