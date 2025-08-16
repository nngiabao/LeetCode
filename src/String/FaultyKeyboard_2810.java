package String;

import java.util.HashMap;

public class FaultyKeyboard_2810 {
    public String finalString(String s) {
        //whenever encounter 'i' => reverse
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == 'i') {
                sb.reverse();
            }else{
                sb.append(c);
            }
        }
        //build the string
        return sb.toString();
    }
}
