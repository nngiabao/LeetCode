package String;

public class RepeatedSubString_459 {
    public static void main(String[] args) {
        System.out.println(repeatedSubstringPattern2("abab"));
    }

    //Solution 1 - not good cause time exceed
    public static boolean repeatedSubstringPattern(String s) {
        if (s.length() <= 1) return false;
        String check = s.substring(0, 1);//boc cai dau tien ra
        for(int i=1; i<s.length()/2+1; i++){
            String[] temp = s.split(s.substring(0,i));
            if(temp.length==0) return true;
        }
        return false;
    }

    //Solution 2 - trick to find substring
    //double it and remove first and last letter in string
    public static boolean repeatedSubstringPattern2(String s) {
        String res = (s+s);
        if(res.substring(1,res.length()-1).contains(s)) return true;
        return false;
    }
    
}
