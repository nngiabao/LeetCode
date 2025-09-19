package String;

import java.util.HashSet;
import java.util.Set;

public class CountPairs_2506 {
    public int similarPairs(String[] words) {
        //to flag if checked or not
        int len = words.length;
        int pairs = 0;
        boolean[] isChecked = new boolean[len];
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (checkSimilarPairs(words[i], words[j])) {
                    pairs++;
                }
            }
        }
        return pairs;
    }

    //put it into a dict
    boolean checkSimilarPairs(String words1, String words2) {
        boolean[] dict = new boolean[26];
        for (char c : words1.toCharArray()) {
            dict[c - 'a'] = true;
        }
        //check
        for (char c : words2.toCharArray()) {
            if (!dict[c - 'a']) return false;
        }
        return true;
    }
    //Solution 2:Using hashmap - better
}
