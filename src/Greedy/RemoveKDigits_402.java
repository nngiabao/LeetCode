package Greedy;

import java.util.*;

public class RemoveKDigits_402 {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();
        for (char c : num.toCharArray()) {
            while (!stack.isEmpty() && k > 0 && stack.peek() > c) {
                stack.pop();
                k--;
            }
            stack.push(c);
        }
        // If k > 0, remove from the end
        while (k > 0 && !stack.isEmpty()) {
            stack.pop();
            k--;
        }
        // Build result from stack
        StringBuilder sb = new StringBuilder();
        for (char c : stack) {
            sb.append(c);
        }

        // Remove leading zeros
        while (sb.length() > 0 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
    //
        return sb.length() == 0 ? "0" : sb.toString();
    }

}
