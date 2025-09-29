package String;

public class MinLengthAfterOperation_3223 {
    public int minimumLength(String s) {
        //build dictionary
        int[] dict = new int[26];
        for (char c : s.toCharArray()) {
            dict[c - 'a']++;
        }
        //count delete char
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (dict[i] < 3) continue;
            if ((dict[i] & 1) == 0) count += dict[i] - 2;
            if ((dict[i] & 1) == 1) count += dict[i] - 1;
        }
        //
        int len = s.length();
        return (count != 0) ? len-count : len;
    }
}
