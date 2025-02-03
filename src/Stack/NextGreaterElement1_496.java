package Stack;

import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElement1_496 {

    //Solution 1: hashmap
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        //put into map
        for (int i = 0; i < nums2.length; i++) {
            map.put(nums2[i], i);
        }

        //return
        for (int i = 0; i < nums1.length; i++) {
            int index = map.get(nums1[i]);
            if((index+1 < nums2.length) && (nums2[index] < nums2[index + 1])){
                nums1[i] = nums2[index+1];
            }else{
                nums1[i] = -1;
            }
        }

        return nums1;
    }
}
