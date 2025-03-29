package String;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class GoatLatin_824 {
    public String toGoatLatin(String sentence) {
        Set<Character> vowel = new HashSet<>(Arrays.asList('a','e','o','i','u','A','E','O','I','U'));
        String [] split = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        //create suffix
        StringBuilder prefix = new StringBuilder("a");
        //
        for(String word : split) {
            StringBuilder temp = new StringBuilder();
            //check if first letter is vowel
            if(vowel.contains(word.charAt(0))) {
                sb.append(word).append("ma").append(prefix);
            }else{
                sb.append(word.substring(1,word.length())).append(word.charAt(0)).append("ma").append(prefix);
            }
            prefix.append('a');
            sb.append(" ");
        }
        return sb.toString();
    }
}
