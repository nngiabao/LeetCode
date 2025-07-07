package String;

public class FindOrginalTypedString1_3330 {
    public int possibleStringCount(String word) {
        int count = 1;
        for(int i = 1; i < word.length(); i++) {
            char ch = word.charAt(i);
            char prev = word.charAt(i-1);
            if(prev == ch) count++;
        }
        return count;
    }
}
