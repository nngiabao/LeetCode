package Array;

public class CheckNumEqualDigit_2283 {
    public boolean digitCount(String num) {
        //build dict
        int[] dict = new int[11];
        //put into dict
        for(char c : num.toCharArray()){
            dict[c - '0']++;
        }
        //
        for(int i=0;i<num.length();i++){
            if(dict[i] != num.charAt(i)-'0') return false;
        }
        return true;

    }
}
