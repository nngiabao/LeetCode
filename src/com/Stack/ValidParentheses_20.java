package com.Stack;
import java.util.Stack;

public class ValidParentheses_20 {
    public static void main(String[] args) {
        String s="(])";
        System.out.println(isValid(s));
    }

    //solution 1
    public static boolean isValid(String s) {
        int i=0;
        Stack<Character> stack = new Stack();
        while(i<s.length()){
            char temp = s.charAt(i);
            if(temp=='(' || temp=='{' || temp=='['){
                stack.push(temp);
            }else{
                if (stack.isEmpty()) return false;
                char top = stack.peek();
                if(((top=='(') && (temp==')')) || ((top=='{') && (temp=='}')) ||
                        ((top=='[') && (temp==']'))){
                    stack.pop();
                }else{
                    return false;
                }

            }
            i++;
        }
        return stack.isEmpty();
    }
}
