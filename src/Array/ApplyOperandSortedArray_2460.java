package Array;

import java.util.HashMap;

public class ApplyOperandSortedArray_2460 {
    public static void main(String[] args) {
        System.out.println(applyOperations(new int[]{1,2,2,1,1,0}));
    }

    public static int[] applyOperations(int[] nums) {
        //use operand first
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                nums[i-1] *=2;
                nums[i] =0;
            }
        }
        //shift 0's
        int j=0,i=1;
        while(i<nums.length){
            if(nums[j]!=0) j++;
            if(nums[i]!=0 && nums[j]==0) {
                //swap
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
            i++;
        }
        return nums;
    }

}
