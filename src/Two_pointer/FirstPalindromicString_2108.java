package Two_pointer;

public class FirstPalindromicString_2108 {
    public String firstPalindrome(String[] words) {
        boolean isPalindrome = false;
        for(String word : words){
            //find palindrome
            int i = 0,j=word.length()-1;
            isPalindrome = true;
            while(i<j){
                if(word.charAt(i)!=word.charAt(j)){
                    isPalindrome = false;
                    break;
                }
            }
            if(isPalindrome) return word;
        }
        return "";
    }
}
