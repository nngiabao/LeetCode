package DP;

public class LongestPalindrome_5 {
    public String longestPalindrome(String s) {
        //edge case
        if(s == null || s.length() == 0) return "";
        //
        int start = 0, end = 0;
        for(int i = 0; i < s.length(); i++){
            int len1 = expandFromCenter(s,i,i);// odd length
            int len2 = expandFromCenter(s,i,i+1);//even length
            int maxLen = Math.max(len1,len2);
            //
            if(maxLen > end-start){
                start = i - (maxLen -1)/2;
                end = i + maxLen/2;
            }
        }
        //
        return s.substring(start, end+1);
    }
    //find around that
    int expandFromCenter(String s, int left, int right) {
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left++;
            right++;
        }
        return right - left - 1;//length of this palindrome
    }
}
