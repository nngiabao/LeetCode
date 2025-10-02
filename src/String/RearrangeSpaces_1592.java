package String;

import java.util.*;

public class RearrangeSpaces_1592 {
    public String reorderSpaces(String text) {
        int n = text.length();
        int spaces = 0;
        List<String> words = new ArrayList<>();

        int i = 0;
        while (i < n) {
            // count spaces
            while (i < n && text.charAt(i) == ' ') {
                spaces++;
                i++;
            }
            // collect a word
            int start = i;
            while (i < n && text.charAt(i) != ' ') {
                i++;
            }
            if (start < i) {
                words.add(text.substring(start, i));
            }
        }

        int w = words.size();
        int between = (w == 1) ? 0 : spaces / (w - 1);
        int tail = (w == 1) ? spaces : spaces % (w - 1);

        String space = " ".repeat(between);
        StringBuilder res = new StringBuilder(n);

        for (int k = 0; k < w; k++) {
            res.append(words.get(k));
            if (k < w - 1) res.append(space);
        }
        res.append(" ".repeat(tail));
        return res.toString();
    }

}
