package String;

import java.util.HashMap;

public class SortingSentence_1859 {
    public String sortSentence(String s) {
        //put into hashmap
        String [] split = s.split(" ");
        int len = split.length;
        String [] res = new String[len];
        ///
        for(String str : split) {
            int s_len = str.length();
            res[str.charAt(len)] = str.substring(0,len);
        }
        ///
        StringBuffer sb = new StringBuffer();
        for(String str : res) {
            sb.append(str).append(" ");
        }
        return sb.toString().trim();
    }
}
