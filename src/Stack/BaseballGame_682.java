package Stack;

import java.util.ArrayList;
import java.util.Stack;

public class BaseballGame_682 {

    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("+")){
                stack.push(stack.peek()+stack.get(stack.size()-2));
            }else if(operations[i].equals("C")){
                stack.pop();
            }else if(operations[i].equals("D")){
                stack.push(stack.peek()*2);
            }else{
                stack.push(Integer.parseInt(operations[i]));
            }
        }

        //sum
        int sum = 0;
        while(!stack.isEmpty()){
            sum += stack.pop();
        }
        return sum;
    }
}
