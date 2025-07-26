package Greedy;

import java.util.*;

public class ConstrcutSmallestNumber_2375 {
    public String smallestNumber(String pattern) {
        //Solution 1:Stack + greedy
        Stack<Integer> stack = new Stack<Integer>();
        //if encounter 'I' => unwind\
        //else 'D' => pop
        StringBuilder sb = new StringBuilder();
        int len = pattern.length();
        for(int i = 0; i <= len; i++) {
            stack.push(i+1);
            if ( i == len || pattern.charAt(i) == 'I' ) {
                //stack is not empty or we meet 'I' we have to pop all of exist element
                while(!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
            }
        }
        //w
        return sb.toString();
    }
}
