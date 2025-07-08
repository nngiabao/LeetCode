package Two_pointer;

import java.util.Arrays;

public class ThreeSumCloset_16 {
    //Solution 1:Use 2 pointers and sorting
    public int threeSumClosest(int[] nums, int target) {
        //
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;//update the closet sum of target
        int sum=0;
        //
        int len = nums.length;
        for(int i=0;i<len-2;i++){
            int left = i+1;
            int right = len-1;
            while(left<right){
                int temp = nums[i]+nums[left]+nums[right];//current sum
                int minDiff = Math.abs(temp-target);
                if(minDiff<min){
                    //update min
                    sum=temp;
                    min=minDiff;
                }
                if(temp<target) left++;
                else right--;
            }
        }
         //
        return sum;
    }
}
