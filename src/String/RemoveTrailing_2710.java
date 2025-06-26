package String;

public class RemoveTrailing_2710 {
    public String removeTrailingZeros(String num) {
        //find last indext that not zero
        int i = num.length() - 1;
        while(i >= 0 && num.charAt(i) == '0') i--;
        return num.substring(0,i);
    }
}
