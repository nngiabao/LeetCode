package Bit;

public class NumberEvenOddBits_2595 {
    public int[] evenOddBit(int n) {
        //convert int bin
        StringBuilder sb = new StringBuilder();
        while(n > 0 ){
            sb.append(n%2);
            n /=2;
        }
        //
        int odd=0,even=0;
        for(int i=0;i<sb.length();i++){
            int ch = sb.charAt(i)-'0';
            if(ch== 0) continue;
            //odd
            if((i&1)==0) even++;
            else odd++;
        }
        return new int[]{even,odd};
    }
}
