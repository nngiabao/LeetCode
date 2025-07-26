package Array;

import java.util.Arrays;

public class MinElement_3300 {
    public int minElement(int[] nums) {
        int len = nums.length;
        int[] cage = new int[len];
        //find sum of digits
        int sum;
        for(int i=0;i<len;i++){
            sum=0;
            //find the sum digit
            while(nums[i] > 0){
                sum+= nums[i]%10;
                nums[i]/=10;
            }
            cage[i] = sum;
        }
        //sort
        Arrays.sort(cage);
        //return first 1
        return cage[0];
    }

    //Soluition 2:Use min variable - best
    public int minElement2(int[] nums) {
        int len = nums.length;
        //find sum of digits
        int min = Integer.MAX_VALUE;
        for(int i=0;i<len;i++){
            int sum=0;
            //find the sum digit
            while(nums[i] > 0){
                sum+= nums[i]%10;
                nums[i]/=10;
            }
            min = Math.min(min,sum);
        }
        //sort
        return min;
    }
}
