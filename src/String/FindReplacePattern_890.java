package String;

import java.util.*;
public class FindReplacePattern_890 {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> result = new ArrayList<>();
        //build the pattern
        Set<Character> set = new HashSet<>();
        for(char c : pattern.toCharArray()) {
            set.add(c);
        }
        //
        for(String w : words) {
            Set<Character> temp = new HashSet<>();
            for(char c : w.toCharArray()) {
                temp.add(c);
            }
            if(set.size() == temp.size()) result.add(w);
        }
        return result;
    }
}
