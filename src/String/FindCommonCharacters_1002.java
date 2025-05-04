package String;

import java.util.*;

public class FindCommonCharacters_1002 {
    public static void main(String[] args) {
        FindCommonCharacters_1002 a = new FindCommonCharacters_1002();
        String[] words = {"bella", "label", "roller"};
        a.commonChars(words);
    }

    //Solution 1:Using built-in array
    public List<String> commonChars(String[] words) {
        int[] dictionary = new int[26];
        //build dictionary
        for (int i = 0; i < words[0].length(); i++) {
            dictionary[words[0].charAt(i) - 'a']++;
        }
        //find common letter
        for (int i = 1; i < words.length; i++) {
            //put into the dictionary
            int[] temp = new int[26];
            for (int j = 0; j < words[i].length(); j++) {
                temp[words[i].charAt(i) - 'a']++;
            }
            //
            for (int j = 0; j < dictionary.length; j++) {
                dictionary[j] = Math.min(dictionary[j], temp[j]);
            }
        }
        //find the common letter left
        List<String> res = new ArrayList<>();
        for (int i = 0; i < dictionary.length; i++) {
            //if (dictionary[i] != 0) list.add(String.valueOf(words[0].charAt(i)));
        }
        return res;
    }

    //Solution 2:Using Hashmap
    public List<String> commonChars2(String[] words) {
        return null;
    }

    //
    public int[] buildDictionary2(String word) {
        return null;
    }
}
