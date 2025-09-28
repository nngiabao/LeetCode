package String;

public class VowelsGameString_3227 {
    public boolean doesAliceWin(String s) {
        int count =0;
        for(char c : s.toCharArray()){
            //a, e, i, o, and u
            if(c == 'a' || c == 'e' || c == 'i'|| c == 'o'|| c == 'u'){
                count++  ;
            }
        }
        if(count == 0) return false;
        if((count&1)== 1) return true;
        return true;
    }
}
