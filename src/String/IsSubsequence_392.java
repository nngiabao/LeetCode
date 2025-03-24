package String;

public class IsSubsequence_392 {
    public boolean isSubsequence(String s, String t) {
        int i=0,j=0; // 2 pointers
        int first_index= s.charAt(i)-'a';
        //
        while(i< s.length() && j< t.length()){
            char c_s = s.charAt(i);
            char c_t = t.charAt(j);
            if(c_s == c_t) i++;
            j++;
        }
        return (i==s.length()) ? true : false;
    }
}
