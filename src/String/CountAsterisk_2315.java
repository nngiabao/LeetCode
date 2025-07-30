package String;

public class CountAsterisk_2315 {
    //Solution 1:
    public int countAsterisks(String s) {
        //count asterisk outside the bar
        boolean isOutside = true;
        int count = 0;
        int i = 0;
        while (i < s.length()) {
            char c = s.charAt(i);
            if (c =='|') isOutside = !isOutside;
            if (c == '*' && isOutside) count++;
            i++;
        }
        //
        return count;
    }
    //Solution 2:when ever its ouside => its even
    public int countAsterisks2(String s) {
        int n = s.length();
        int count = 0;
        int star = 0;
        for (char c : s.toCharArray()) {
            if (c == '|') count++;
            if (c == '*' && count % 2 == 0) star++;
        }
        return star;
    }
}
