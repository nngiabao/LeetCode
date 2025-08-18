package String;

public class CheckDigitsEqual_3461 {
    public boolean hasSameDigits(String s) {
        //
        int temp = 0;
        while (s.length() > 2){
            for(int i=1;i<s.length();i++){
                temp = (s.charAt(i)-'0'+s.charAt(i-1)-'0')%10+(temp*10);
            }
            s = String.valueOf(temp);
        }
        return s.charAt(0) == s.charAt(1);
    }

    public boolean hasSameDigits2(String s) {
        int n = s.length();
        if (n == 2) return s.charAt(0) == s.charAt(1);

        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = s.charAt(i) - '0';

        for (int len = n; len > 2; len--) {
            for (int i = len - 2; i >= 0; i--) {         // right-to-left
                a[i] = (a[i] + a[i + 1]) % 10;
            }
            // after this pass, effective length is len-1, stored in a[0..len-2]
        }
        return a[0] == a[1];
    }
}
