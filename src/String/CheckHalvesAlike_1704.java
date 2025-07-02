package String;

import java.util.Arrays;
import java.util.HashSet;

public class CheckHalvesAlike_1704 {
    //Solution 1: SLower than solution 2
    public boolean halvesAreAlike(String s) {
        //
        int len = s.length()/2;
        String first = s.substring(0,len);
        String second = s.substring(len,len*2);
        HashSet<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        int i=0;
        int count_first = 0,count_second = 0;
        while(i< len){
            if(set.contains(first.charAt(i))) count_first++;
            if(set.contains(second.charAt(i))) count_second++;
            i++;
        }
        return (count_first == count_second) ? true : false;
    }
    //SOlution 2:write the method count
    public boolean halvesAreAlike2(String s) {
        //check if it wovel
        //=> return true false
        int len = s.length()/2;
        String str = s.substring(0,len);
        String str2 = s.substring(len,len*2);
        int count_first = count(str),count_second = count(str2);
        //
        return (count_first == count_second) ? true : false ;
    }
    //count method
    public int count(String s){
        int count = 0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            //
            if(c == 'a' || c == 'e' | c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') count++;
        }
        return count;
    }
}
