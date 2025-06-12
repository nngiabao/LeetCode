package MonotonicStack;

import java.util.*;

public class FinalPriceSPecialDiscount_1475 {
    //Solution 1:Using 2 pointers
    //SOlution 2: Monotonic stack increasing
    public int[] finalPrices(int[] prices) {
        int len = prices.length;
        int[] result = new int[len];
        //
        Stack<Integer> stack = new Stack<>();
        for(int i=len-1;i>=0;i--){
            while(!stack.isEmpty() && stack.peek() > prices[i]){
                stack.pop();
            }
            result[i] = stack.isEmpty()?prices[i]:prices[i]-stack.peek();
            stack.push(prices[i]);
        }
        return result;
    }
}
