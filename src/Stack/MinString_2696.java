package Stack;

import java.util.Stack;

public class MinString_2696 {
    public static void main(String[] args) {
        MinString_2696 a = new MinString_2696();
        String s = "ABFCACDB";
        a.minLength(s);
    }

    public int minLength(String s) {
        //
        Stack<Character> stack = new Stack<Character>();
        stack.push(s.charAt(0));
        //
        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            //check stack not empty otherwise => push
            if (!stack.isEmpty()
                    && (c == 'D' && stack.peek() == 'C'
                    || c == 'B' && stack.peek() == 'A')){
                stack.pop();
            } else stack.push(c);
        }
        //
        return stack.size();
    }
}
