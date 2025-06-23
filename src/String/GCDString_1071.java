package String;

import java.util.HashSet;

public class GCDString_1071 {
    public String gcdOfStrings(String str1, String str2) {
        //edge case: str1+str2 != str2+str1 => false
        if(!(str1+str2).equals(str2+str1)) return "";
        //find common prefix
        int len_1 = str1.length();
        int len_2 = str2.length();
        int gcd_len = gcd(len_1,len_2);
        //int len = Math.gcd
        String common_prefix = str1.substring(0,gcd_len);
        return (str2.substring(0,gcd_len).equals(common_prefix))
                ? common_prefix : "";

    }
    //find gcd
    int gcd(int a, int b){
        while(a != b){
            if(a > b) a -= b;
            else b -= a;
        }
        return a;
    }
}
