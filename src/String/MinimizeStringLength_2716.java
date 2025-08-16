package String;

public class MinimizeStringLength_2716 {
    public int minimizedStringLength(String s) {
        int[] dict = new int[26];
        int len = 0;
        for(char c : s.toCharArray()){
            if(dict[c - 'a'] == 0){
                dict[c - 'a'] = 1;
                len++;
            };
        }
        return len;
    }
}
