package String;

public class PercentageLetterInString_2278 {
    public int percentageLetter(String s, char letter) {
        //
        int count = 0;
        int len = s.length();
        for(int i = 0; i < len; i++) {
            if(s.charAt(i) == letter) count++;
        }
        return (count == 0) ? 0 : len / count;
    }
}
