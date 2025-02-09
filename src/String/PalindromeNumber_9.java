package String;

public class PalindromeNumber_9 {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        String inp = Integer.toString(x);
        int i=0,j=inp.length()-1;
        while(i<j){
            if(inp.charAt(i)!=inp.charAt(j)) return false;
            i++;
            j--;
        }
        return false;
    }
}
