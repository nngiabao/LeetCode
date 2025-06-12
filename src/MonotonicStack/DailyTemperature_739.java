package MonotonicStack;
import java.util.*;
public class DailyTemperature_739 {
    class Pair{
        int temp;
        int index;
        Pair(int temp, int index){
            this.temp = temp;
            this.index = index;
        }
    }

    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        int[] result = new int[len];
        //
        Stack<Pair> stack = new Stack<>();
         //
        for(int i=len-1;i>=0;i--){
            while(!stack.isEmpty() && temperatures[i] >= stack.peek().temp){
                stack.pop();
            }
            //
            result[i] = stack.isEmpty()?0:stack.peek().index-i;
            stack.push(new Pair(temperatures[i],i));

        }
        return result;
    }
    //Solution 2: best - check agin

}
