package String;

import java.util.HashMap;

public class WordPattern_290 {
    //SOlution 1: Hash map
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        String[] words = s.split(" ");
        //check same length
        if (pattern.length() != words.length) return false;
        int i = 0;
        while (i < pattern.length()) {
            if(map.containsKey(pattern.charAt(i))){
                if(!map.get(pattern.charAt(i)).equals(words[i])) return false;
            }else{
                if(map.containsValue(words[i])) return false;
                map.put(pattern.charAt(i), words[i]);
            }
            i++;
        }
        return true;
    }
    //SOlution 2 using 2 arrays to check
    public boolean wordPattern2(String pattern, String s) {
        String[] words = s.split(" ");
        //check same length
        if (pattern.length() != words.length) return false;
        Character [] c_array = new Character[26];
        int i = 0;
        //pattern only contains lower-case English
        while (i < pattern.length()) {
            char c = pattern.charAt(i);
            if(c_array[c-'a'] == null){}
            i++;
        }
        return true;
    }
}
