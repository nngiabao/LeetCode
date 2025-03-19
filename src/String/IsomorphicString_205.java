package String;
import java.util.*;

public class IsomorphicString_205 {
    //Solution 1: Hash table
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> table = new HashMap<>();
        int i = 0;
        while(i<s.length()){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if(table.containsKey(c1)){
                if(!table.get(c1).equals(c2)) return false;
            }else{
                if(table.containsValue(c2)) return false;
                table.put(c1,c2);
            }
            i++;
        }
        return true;
    }

    //Solution 2:
    public boolean isIsomorphic2(String s, String t) {
        //create 2 arrays
        int[] chars_t = new int[256];
        int[] chars_s = new int[256];
        Arrays.fill(chars_t,-1);
        Arrays.fill(chars_s,-1);
        //check if its not null
        for(int i=0;i<s.length();i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            //check if array element is not null
            if( chars_s[c1]!= -1 || chars_t[c2] != -1){
                if(chars_s[c1]!= c2 || chars_t[c2]!=c1) return false;{}
            }else{
                chars_s[c1] = c2;
                chars_t[c2] = c1;
            }
        }
        return true;
    }
}
