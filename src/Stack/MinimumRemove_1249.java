package Stack;

import java.util.Stack;

public class MinimumRemove_1249 {
    public static void main(String[] args) {
        MinimumRemove_1249 m = new MinimumRemove_1249();
        String s = "lee(t(c)o)de)";
        m.minRemoveToMakeValid(s);
    }

    //Solution 1:Using stack
    public String minRemoveToMakeValid(String s) {
        //Using 2 browse
        int open = 0;
        StringBuilder sb = new StringBuilder();
        //Remove the ')'
        for (char c : s.toCharArray()) {
            if (c == '(') open++;
            if (c == ')') {
                if (open == 0) continue;
                open--;
            }
            sb.append(c);
        }
        //Remove the '('
        int close = 0;
        StringBuilder res = new StringBuilder();
        for (int i = sb.length() - 1; i >= 0; i--) {
            char c = sb.charAt(i);
            if (c == ')') close++;
            if (c == '(') {
                if (close == 0) continue;
                close--;
            }
            res.append(c);
        }

        return res.reverse().toString();
    }
}
