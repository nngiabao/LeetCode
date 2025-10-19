package String;

import java.util.HashSet;
import java.util.Set;

public class CountVowelSubStrings_2062 {
    public int countVowelSubstrings(String word) {
        //
        int len = word.length();
        if (len < 5) return 0;
        int count = 0;
        for (int i = 0; i < len - 4; i++) {
            Set<Character> vowels = new HashSet<Character>();
            for (int j = i; j < len; j++) {
                char c = word.charAt(j);
                if(vowels.size() == 5) count++;
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') vowels.add(c) ;
                else break;

            }
        }
        return count;
    }
}
