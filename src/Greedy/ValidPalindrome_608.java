package Greedy;

public class ValidPalindrome_608 {
    public boolean validPalindrome(String s) {
        int i = 0, j = s.length() - 1,count = 0;
        //2 pointers
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                if(s.charAt(i+1)!=s.charAt(j)){
                    if(s.charAt(i)!=s.charAt(j-1)){
                        return false;
                    }else{
                        j--;
                        count++;
                    }
                }else{
                    i++;
                    count++;
                }
                count++;
                j--;
            }
            if(count > 1 ) return false;
            j--;
            i++;
        }
        return true;
    }
}
