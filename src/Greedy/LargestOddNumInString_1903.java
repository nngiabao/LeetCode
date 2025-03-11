package Greedy;

public class LargestOddNumInString_1903 {
    public String largestOddNumber(String num) {
       boolean hasOdd=false;
        int i= num.length()-1;
        while(i>0){
            int i_num= num.charAt(i)-'0';
            if((i_num&1)==1){
                hasOdd=true;
                break;
            }
            i--;
        }
        return hasOdd ? num.substring(0,i) : "";
    }
}
