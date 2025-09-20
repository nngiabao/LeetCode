package String;

import java.util.*;

public class SplitStrings_2788 {
    //Solution 1:
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        //
        List<String> res = new ArrayList<>();
        //
        for(String word : words) {
            StringBuilder sb = new StringBuilder();
            for(char c : word.toCharArray()) {
                if(c == separator) {
                    if(!sb.isEmpty()){
                        res.add(sb.toString());
                        sb = new StringBuilder();
                    }
                }else sb.append(c);
            }
            if(!sb.isEmpty()) res.add(sb.toString());
        }
        return res;
    }
}
