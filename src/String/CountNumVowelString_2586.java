package String;

import java.util.ArrayList;
import java.util.List;

public class CountNumVowelString_2586 {
    public int vowelStrings(String[] words, int left, int right) {
        int count = 0;
        List<Character> vowels = new ArrayList<Character>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        for(int i=left; i<=right; i++){
            if(vowels.contains(words[i].charAt(0)) && vowels.contains(words[i].charAt(words[i].length()-1))) count++;
        }
        return count;
    }
    //Solution 2: similiar but same
    public int vowelStrings2(String[] words, int left, int right) {
        int count = 0;
        for(int i=left; i<=right; i++){
            String str = words[i];
            char ch = str.charAt(0);
            char ele = str.charAt(str.length()-1);
            if((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') && (ele == 'a' || ele == 'e' || ele == 'i' || ele == 'o' || ele == 'u')){
                count++;
            }
        }
        return count;
    }
}
