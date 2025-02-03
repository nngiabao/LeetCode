package Stack;

import java.util.Stack;

public class RemoveAdjectiveDupString_1047 {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("azxxzy"));
    }
    public static String removeDuplicates(String s) {
        if(s.length()==1) return s;
        Stack<Character> stack = new Stack<Character>();
        int i=0;
        while(i<s.length()) {
            char c = s.charAt(i);
            if(!stack.isEmpty()){
                if(stack.peek() == c) stack.pop();
                else stack.push(c);
            }else{
                stack.push(c);
            }
            i++;
        }

        //build string
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}
