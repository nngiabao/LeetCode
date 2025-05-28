package Greedy;

public class LexicographicallySmallestPalindrome_2697 {
    public static void main(String[] args) {
        LexicographicallySmallestPalindrome_2697 a= new LexicographicallySmallestPalindrome_2697();
        String s = "egdbacfedwd";
        System.out.println(a.makeSmallestPalindrome(s));
    }
    public String makeSmallestPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        int len = s.length();
        for(int i = 0; i < len/2; i++){
            char c = s.charAt(i);
            char c_tail = s.charAt(len-i-1);
            if(c < c_tail) sb.append(c);
            else if(c == c_tail) sb.append(c);
            else sb.append(c_tail);
        }
        StringBuilder sb_head = new StringBuilder(sb);
        //take midle index
        return ((len&1)==1) ? sb_head.append(s.charAt(len/2)).append(sb.reverse()).toString()
                : sb_head.append(sb.reverse()).toString();
    }
}
