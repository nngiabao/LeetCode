package String;

public class CalDigitSumString_2243 {
    public String digitSum(String s, int k) {
        if(s.length() == 1) return s;
        //
        while(s.length() > k){
            StringBuilder sb = new StringBuilder();
            int i=0;
            //
            // while()
            s = sb.toString();
        }
        return s;
    }
    //
    public Integer sumDigit( String s){
        int n = Integer.parseInt(s);
        int sum =0;
        int carry=0;
        while(n>0 || sum > 10){
            sum += carry;
            carry = sum/10;
            sum = sum%10;
        }
        return ((char)sum+'0');
    }
}
