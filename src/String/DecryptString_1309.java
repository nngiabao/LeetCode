package String;

import java.util.HashMap;

public class DecryptString_1309 {
    //Solution 1: Not optimized
    public String freqAlphabets(String s) {
        //create a map
        StringBuilder sb = new StringBuilder();
        //
        int i = s.length()-1;
        while(i>=0){
            char c = s.charAt(i);
            if(c == '#'){
                //we have to convert 2 char to int then plus to 'a' -1 => return char in ascii table
                sb.append((char) (Integer.parseInt(""+ s.charAt(i-2)+ s.charAt(i-1))+'a'-1));
                i-=3;
            }else{
                sb.append(c-'0'+'a'-1);
                i--;
            }
        }
         //
        return sb.reverse().toString();
    }

    //Solution 2:
    
}
