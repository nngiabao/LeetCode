package String;

import java.util.*;
public class CheckAcronym_2828 {
    //
    public boolean isAcronym(List<String> words, String s) {
        //edge case
        if(s.length() != words.size()) return false;
        /// using 2 pointers
        for(int i=0;i<words.size();i++){
            char first = words.get(i).charAt(0);
            char c = s.charAt(i);
            if(first != c) return false;
        }
        ///
        return true;
    }
}
