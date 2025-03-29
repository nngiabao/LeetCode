package String;

import java.util.Stack;

public class ReverseOnlyLetters_917 {
    public static void main(String[] args) {
        System.out.println(reverseOnlyLetters2("7_28]"));
    }
    //Solution 1: Using stack
    public static String reverseOnlyLetters(String s) {
        if(s.length() == 1) return s;
        //Using regex to detect character is not alphabet
        Stack<Character> stack = new Stack<Character>();
        //put letters into stack
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(Character.isLetter(c)) stack.push(c);
        }
        //result string
        StringBuilder res = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(Character.isLetter(c)) res.append(stack.pop());
            else res.append(c);
        }
        return res.toString();
    }

    //Solution 2: Using 2 pointers
    public static String reverseOnlyLetters2(String s) {
        int i=0,j=s.length()-1;
        //put this string in String Builder
        StringBuilder res = new StringBuilder(s);
        while(i<j){
            char c_i = s.charAt(i);
            char c_j = s.charAt(j);
            //keep moving right until meet letter or left < right
            if(!Character.isLetter(s.charAt(i))) i++;
            if(!Character.isLetter(s.charAt(j))) j--;
            if(Character.isLetter(c_i) && Character.isLetter(c_j)){
                //swap when both are letters
                char temp = s.charAt(i);
                res.setCharAt(i,s.charAt(j));
                res.setCharAt(j,temp);
                i++;
                j--;
            }
        }
        return res.toString();
    }
}
