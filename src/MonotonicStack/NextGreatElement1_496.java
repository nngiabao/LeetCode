package MonotonicStack;

import java.util.*;
public class NextGreatElement1_496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        //if( nums1.length == 1) return
        int len = nums1.length;
        int[] result = new int[len];
        //put into map 2
        HashMap<Integer,Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        int len2 = nums2.length;
        for(int i= len2-1;i>=0;i--){
            //monotonic stack
            while(!stack.isEmpty() && nums2[i] > stack.peek()){
                stack.pop();
            }
            map.put(nums2[i],stack.isEmpty()?-1:stack.peek());
            stack.push(nums2[i]);
        }
        //look up value result
        for(int i=0;i<len;i++){
            result[i] = map.get(nums1[i]);
        }
        return result;
    }
}
