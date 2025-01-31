package Stack;

import java.util.Stack;

public class RemoveOutermostParentheses_1021 {
    //using count
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int i=0,count=1,p=0;
        while(i<s.length()){
            if(s.charAt(i)=='('){
                if(count!=1) sb.append(s.charAt(i));
                count++;
            }
            if(s.charAt(i)==')'){
                if(count!=1) sb.append(s.charAt(i));
                count--;
            }
            i++;
        }
        return sb.toString();
    }

    //using stack
}
