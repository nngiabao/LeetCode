package BitMasking;

public class FirstLetterAppearTwice_2351 {
    public char repeatedCharacter(String s) {
        //
        int len = s.length();
        for(int i=1;i<len;i++){
            char c = s.charAt(i);
            int firstIndex = s.indexOf(c);
            if(s.indexOf(c) != i) return c;
        }
        return 'a';
    }
}
