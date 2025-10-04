package Stack;

import java.util.*;

public class MinAddParentheses_921 {
    //Solution 1:Using stack
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        //
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') stack.push(c);
            else {
                if (!stack.isEmpty()) stack.pop();
                else count++;
            }
        }
        //check if anything left in the stack
        while (!stack.isEmpty()) {
            stack.pop();
            count++;
        }
        //
        return count;
    }

    //Solution 2:Using variable to track
    public int minAddToMakeValid2(String s) {
        int balance = 0, additionalCloseBrackets = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                balance++;
            } else {
                if (balance > 0) {
                    balance--;
                } else {
                    additionalCloseBrackets++;
                }
            }
        }
        return balance + additionalCloseBrackets;
    }
}
