package String;

import java.util.*;

public class StringMatchingArray_1408 {
    public List<String> stringMatching(String[] words) {
        //sort array first
        Arrays.sort(words, (a, b) -> a.length() - b.length());
        //
        List<String> res = new ArrayList<>();
        for(int i = 0; i < words.length; i++){
            for(int j = i + 1; j < words.length; j++){
                if(words[j].contains(words[i])) {
                    res.add(words[i]);
                    break;
                }
            }
        }
        return res;
         //
    }
    //Solution 2:Optimize sort step
    public List<String> stringMatching2(String[] words) {
        List<String> res = new ArrayList<>();

        // No need to sort unless you're using it to reduce comparisons — here it helps.
        Arrays.sort(words, Comparator.comparingInt(String::length));

        // Use `contains` only when necessary
        for (int i = 0; i < words.length - 1; i++) {
            String word = words[i];
            for (int j = i + 1; j < words.length; j++) {
                if (words[j].contains(word)) {
                    res.add(word);
                    break; // move to next shorter word
                }
            }
        }
        return res;
    }

}
