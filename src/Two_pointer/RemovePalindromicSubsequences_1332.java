package Two_pointer;

public class RemovePalindromicSubsequences_1332 {
    public int removePalindromeSub(String s) {
        //CHECK IF palindrome => return 1
        //other wise return 2;
        int l=0,r = s.length()-1;
        //
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return 2;
            }
            l++;
            r--;
        }
        return 1;
    }
}
