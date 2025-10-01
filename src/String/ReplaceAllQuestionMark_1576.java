package String;

public class ReplaceAllQuestionMark_1576 {
    public String modifyString(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != '?') {
                sb.append(c);
            } else {
                int prev = (sb.length() == 0) ? -1 : sb.charAt(sb.length() - 1) - 'a';
                int next = (i == s.length() - 1 || s.charAt(i + 1) == '?')
                        ? -1 : s.charAt(i + 1) - 'a';
                int k = 0;                   // try a, b, c
                while (k == prev || k == next) k++;
                sb.append((char) ('a' + k));
            }
        }
        return sb.toString();
    }
}
