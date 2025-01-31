package Stack;

import java.util.Stack;

public class MakeStringGreat_1544 {
    public static void main(String[] args) {
        System.out.println(makeGood("Pp"));
    }

    public static String makeGood(String s) {
        if(s.length() == 0) return "";
        if(s.length() == 1) return s.charAt(0) + "";
        StringBuffer sb = new StringBuffer();
        Stack<Character> stack = new Stack<Character>();
        int i=s.length()-1;
        while(i>-1){
            if(stack.isEmpty()) stack.push(s.charAt(i));
            else{
                if(Math.abs(s.charAt(i) - stack.peek()) <32) stack.push(s.charAt(i));
                else stack.pop();
            }
            i--;
        }
        //apply to sb
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }

        return sb.toString();
    }
}
