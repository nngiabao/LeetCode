package Array;

import java.util.*;

public class UniqueMorseCode_804 {
    public static void main(String[] args) {
        String[] w = {"gin","zen","gig","msg"};
        System.out.println(uniqueMorseRepresentations(w));
    }
    public static int uniqueMorseRepresentations(String[] words) {
        if (words.length == 1) return 1;
        HashSet<String> uniqueSet = new HashSet<>();
        HashMap<Character, String> mp = new HashMap<>();
        mp.put('a', ".-");
        mp.put('b', "-...");
        mp.put('c', "-.-.");
        mp.put('d', "-..");
        mp.put('e', ".");
        mp.put('f', "..-.");
        mp.put('g', "--.");
        mp.put('h', "....");
        mp.put('i', "..");
        mp.put('j', ".---");
        mp.put('k', "-.-");
        mp.put('l', ".-..");
        mp.put('m', "--");
        mp.put('n', "-.");
        mp.put('o', "---");
        mp.put('p', ".--.");
        mp.put('q', "--.-");
        mp.put('r', ".-.");
        mp.put('s', "...");
        mp.put('t', "-");
        mp.put('u', "..-");
        mp.put('v', "...-");
        mp.put('w', ".--");
        mp.put('x', "-..-");
        mp.put('y', "-.--");
        mp.put('z', "--..");

        for(int i = 0; i < words.length; i++){
            StringBuilder temp = new StringBuilder();
            for(int j=0; j < words[i].length(); j++){
                temp.append(mp.get(words[i].charAt(j)));
            }
            uniqueSet.add(temp.toString());
        }
        return uniqueSet.size();
    }
}
