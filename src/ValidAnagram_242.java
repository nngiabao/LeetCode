import java.util.HashMap;
import java.util.stream.Collectors;

public class ValidAnagram_242 {
    public static void main(String[] args) {
        String s ="aacc";
        String t ="ccac";
        System.out.println(isAnagram3(s,t));
    }

    //Solution 1
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0;
        while(i<s.length() || i<t.length()) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            //put into map at the same time
            map.put(charS, map.getOrDefault(charS, 0) + 1);
            map.put(charT, map.getOrDefault(charT, 0) - 1);
            //inc
            i++;
        }


        //check if all value of hashmap = 0 => same
        //using value loop
        for(Integer val : map.values()) {
            if(val != 0) return false;
        }
        return true;
    }
    //Solution 2
    public static boolean isAnagram2(String s, String t) {
        if(s.length() != t.length()) return false;
        //Sorted string
        String sortedStrS = s.chars()
            .sorted()
            .mapToObj(c -> String.valueOf(c)).collect(Collectors.joining());
        String sortedStrT = t.chars()
                .sorted()
                .mapToObj(c -> String.valueOf(c)).collect(Collectors.joining());
        //Compare by poitner
        int i=0;
        while(i<sortedStrT.length() || i<sortedStrS.length()) {
            if(sortedStrT.charAt(i) != sortedStrS.charAt(i)) return false;
            i++;
        }
        //in case still have

        return true;
    }
    //Solution 3 - best
    public static boolean isAnagram3(String s, String t) {
        if(s.length() != t.length()) return false;
        //Sorted string
        Integer[] temp = new Integer[26];
        for(int i=0; i<s.length(); i++) {
            int index = s.charAt(i) - 'a';
            if(temp[index] == null){
                temp[index] = 1;
            }else{
                temp[index]++;
            }
        }
        //check if exist value different from 0 => false
        for(int i=0; i<t.length(); i++) {
            int index = t.charAt(i) - 'a';
            if(temp[index]==null || temp[index]==0) return false;
            temp[index]--;
        }
        return true;
    }
}
