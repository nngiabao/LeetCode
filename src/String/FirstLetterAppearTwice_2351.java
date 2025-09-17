package String;

public class FirstLetterAppearTwice_2351 {
    public char repeatedCharacter(String s) {
        int[] dict = new int[26];
        int len = s.length();
        if(len == 2) return s.charAt(0);
        //
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < len; i++) {
            min = dict[s.charAt(i) - 'a'] ;
        }
        return 'a';
    }
}
