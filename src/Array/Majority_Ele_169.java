package Array;

import java.util.Arrays;
import java.util.Hashtable;

public class Majority_Ele_169 {
    static int count=1,value;
    public static void main(String[] args) {
        int[] test ={2,2,1,1,1,2,2};
        System.out.println(majorityElement3(test));
    }

    //Solution1
     static int majorityElement(int[] nums){
         Hashtable<Integer, Integer> m = new Hashtable<Integer, Integer>();
         //int count=0,value;
         //put into map
         for(int i=0;i<nums.length;i++) {
            //count+=m.get(nums[i]);
             m.compute(nums[i], (k, v) -> {
                 //int value = m.get(k);
                 if (v != null) {
                     if(++v > count){
                         count=v;
                         value = k;
                     }
                     return v;
                 } else {
                     return 1;
                 }
             });

             //check if count > n/2 => return
             if (count > nums.length/2){
                 return nums[i];
             }
         }
        return value;
    }
    //Solution 2
    //Boyer-moore algorithm
    public static int majorityElement2(int[] nums) {
        int count=0,candidate=0;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        /*while(count<=nums.length/2 && i<nums.length){
            if(nums[i]==candidate){
                count++;
            }else{
                count--;
            }
            if(count==0){
                candidate=nums[i];
                count=1;
            }
            i++;
        }*/
        return candidate;
    }

    //SOlution 3
    public static int majorityElement3(int[] nums) {
        int [] result = Arrays.stream(nums).sorted().toArray();
        return result[nums.length/2];
    }
}
