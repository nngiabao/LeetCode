package Sorting;

import java.util.Arrays;

public class Determine2StringsAreClose_1657 {
    public boolean closeStrings(String word1, String word2) {
        //edge
        if (word1.length() != word2.length()) return false;
        //build dict
        int[] w1_dict = new int[26];
        int[] w2_dict = new int[26];
        //
        for (char c : word1.toCharArray()) w1_dict[c - 'a']++;
        for (char c : word2.toCharArray()) w2_dict[c - 'a']++;
        //
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if((w1_dict[i] == 0 && w2_dict[i] != 0 )|| (w1_dict[i] != 0 && w2_dict[i] == 0 )) return false;
        }
        //
        Arrays.sort(w1_dict);
        Arrays.sort(w2_dict);
        return Arrays.equals(w1_dict, w2_dict);
    }
}
