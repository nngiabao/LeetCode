package Stack;

import java.util.Stack;

public class ClearDigits_3174 {
    public String clearDigits(String s) {
        Stack<Character> stack = new Stack<Character>();
        int i=0;
        while(i<s.length()) {
            if(stack.isEmpty()) stack.push(s.charAt(i));
            else{
                char ch = s.charAt(i);
                if(ch - 'a' < 0) stack.pop();
                else stack.push(s.charAt(i));
            }
            i++;
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()) {
            char ch = stack.pop();
            if(ch - 'a' >= 0) sb.append(ch);
        }
        return sb.reverse().toString();
    }
}
