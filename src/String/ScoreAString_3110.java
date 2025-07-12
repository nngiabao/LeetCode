package String;

public class ScoreAString_3110 {
    public int scoreOfString(String s) {
        //
        int sum = 0;
        for(int i = 1; i < s.length(); i++){
            int c = s.charAt(i) - 'a';
            int prev_c = s.charAt(i-1) - 'a';
            sum+=Math.abs(c-prev_c);
        }
         //
        return sum;
    }
}
