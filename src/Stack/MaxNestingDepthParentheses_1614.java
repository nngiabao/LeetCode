package Stack;

import java.util.Stack;

public class MaxNestingDepthParentheses_1614 {
    public static void main(String[] args) {
        System.out.println(maxDepth("(1+(2*3)+((8)/4))+1"));
    }

    public static int maxDepth(String s) {
        int max = 0, i = 0;
        Stack<Character> stack = new Stack<>();
        while (i < s.length()) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.add(c);
            } else if(c == ')'){
                if (max < stack.size()) max = stack.size();
                stack.pop();
            }
            i++;
        }
        return max;
    }
}
