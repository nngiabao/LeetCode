package String;

import java.util.*;

public class FindReplacePattern_890 {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> result = new ArrayList<>();

        for (String word : words) {
            if (matches(word, pattern)) {
                result.add(word);
            }
        }
        return result;
    }

    private boolean matches(String word, String pattern) {
        if (word.length() != pattern.length()) return false;

        Map<Character, Character> map1 = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            char w = word.charAt(i);
            char p = pattern.charAt(i);

            // If already mapped, must be consistent
            if (map1.containsKey(p) && map1.get(p) != w) return false;
            if (map2.containsKey(w) && map2.get(w) != p) return false;

            // Otherwise create mapping
            map1.put(p, w);
            map2.put(w, p);
        }

        return true;
    }
}
