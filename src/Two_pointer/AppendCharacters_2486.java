package Two_pointer;

public class AppendCharacters_2486 {
    public int appendCharacters(String s, String t) {
        int s_len = s.length();
        int t_len = t.length();
        int i=0,j=0;
        while(i < s_len && j < t_len) {
            if(s.charAt(i) == t.charAt(j)) j++;
            i++;
        }
        return t_len-j;
    }
}
