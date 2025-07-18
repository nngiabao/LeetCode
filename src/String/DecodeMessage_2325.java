package String;

import java.util.*;

public class DecodeMessage_2325 {
    //Solution 1:
    public String decodeMessage(String key, String message) {
        Map<Character, Character> map = new HashMap<>();
        char substitute = 'a';

        // Build substitution table from key
        for (int i = 0; i < key.length(); i++) {
            char ch = key.charAt(i);
            if (ch != ' ' && !map.containsKey(ch)) {
                map.put(ch, substitute++);
            }
        }

        // Decode the message
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);
            if (ch == ' ') {
                res.append(' ');
            } else {
                res.append(map.get(ch));
            }
        }

        return res.toString();
    }
    //Solution 2:best
    class Solution {
        public String decodeMessage(String key, String message) {
            char[] alph = new char[26];
            int i = 0;
            for(char ch : key.toCharArray()){
                if(ch == ' ') continue;
                int index = (int) (ch - 'a');
                if((int) alph[index] != 0) continue;
                alph[index] = (char) ('a' + i);
                i++;
                if(i == 26) break;
            }
            StringBuilder sb = new StringBuilder();
            for(char ch : message.toCharArray()){
                if(ch == ' '){
                    sb.append(ch);
                    continue;
                }
                int index = (int) (ch - 'a');
                sb.append(alph[index]);
            }
            return sb.toString();
        }
    }


}
