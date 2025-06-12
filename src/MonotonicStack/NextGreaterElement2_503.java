package MonotonicStack;

import java.util.Stack;

public class NextGreaterElement2_503 {
    public static void main(String[] args) {
        NextGreaterElement2_503 a = new NextGreaterElement2_503();
        System.out.println(a.nextGreaterElements(new int[]{1,2,1}));

    }
    public int[] nextGreaterElements(int[] nums) {
        //create double array => make it to be circular array
        int len = nums.length;
        int[] res = new int[len];
        int[] circular = new int[len*2];
        for(int i = 0; i < len*2; i++){
            circular[i] = nums[(i+len)%len];
        }
        //mono decreasing stack
        Stack<Integer> stack = new Stack<>();
        for(int i = len*2-1; i >=0 ; i--){
            while(!stack.isEmpty() && stack.peek() <= circular[i]){
                stack.pop();
            }
            if(i<len) res[i] = stack.isEmpty()?-1:stack.peek();
            stack.push(circular[i]);
        }
        return res;
    }
}
