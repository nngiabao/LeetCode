package String;

import java.util.*;

public class MaxProductCommon_318 {
    //Solution 1:Compare pair of words - small data set
    public int maxProduct(String[] words) {
        int max = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (!shareCommon(words[i], words[j])) {
                    max = Math.max(max, words[i].length() * words[j].length());
                }
            }
        }
        return max;
    }

    private boolean shareCommon(String w1, String w2) {
        Set<Character> set = new HashSet<>();
        for (char c : w1.toCharArray()) set.add(c);
        for (char c : w2.toCharArray()) {
            if (set.contains(c)) return true;
        }
        return false;
    }


}
