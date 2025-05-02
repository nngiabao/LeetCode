package String;

import java.util.Hashtable;
import java.util.Map;

public class CheckOccurrences_1941 {
    //Solution 1:
    public boolean areOccurrencesEqual(String s) {
        //create array for 26 letters
        int [] letters = new int[26];
        for(int i = 0; i < s.length(); i++) {
            letters[s.charAt(i) - 'a']++;
        }
        //check good string or not
        int check = 0;
        for(int i = 0; i < 26; i++) {
            if(letters[i] == 0) continue;
            else if(check != 0 ){
                if(check != letters[i]) return false;
            }
            check = letters[i];
        }
        return true;
    }
    //Solution 2:Hash table
    public boolean areOccurrencesEqual2(String s) {
        Hashtable<Character,Integer> map = new Hashtable<>();
        //put in to dictionary
        for(int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        Integer check = null;
        //check occurences
        for(Integer i : map.values()) {
            if(check == null) check = i;
            else if(check.equals(i)) return false;
        }
        return true;
    }
}
