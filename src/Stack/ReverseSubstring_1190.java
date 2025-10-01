package Stack;

import java.util.*;

public class ReverseSubstring_1190 {
    public static void main(String[] args) {
        ReverseSubstring_1190 a = new ReverseSubstring_1190();
        String s = "(u(love)i)";
        a.reverseParentheses(s);
    }
    public String reverseParentheses(String s) {
        Stack<Character> stack = new Stack<Character>();
        //
        for (char c : s.toCharArray()) {
            //while stack
            if (c != ')') stack.push(c);
            else {
                //pop it into a string to reverse
                StringBuilder temp = new StringBuilder();
                while (stack.peek() != '(') {
                    temp.append(stack.pop());
                }
                //have to pop '('
                stack.pop();
                //reverse
                temp.reverse();
                //push back
                for (int i = 0; i < temp.length(); i++) {
                    stack.push(temp.charAt(i));
                }
            }
        }
        //build the res
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        //
        return sb.reverse().toString();
    }
}
