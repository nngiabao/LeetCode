package Array;

import java.util.Arrays;

public class DegreeOfArray_697 {
    public static void main(String[] args) {
        //1,2,2,3,1,4,2
        System.out.println(findShortestSubArray(new int[]{1,2,2,3,1,4,2}));
    }
    /*
    This question is find first and last index of most repeated number
    so we will have their sub array
     */

    //using sliding window
    public static int findShortestSubArray(int[] nums) {

        int [] temp = nums.clone();
        Arrays.sort(temp);
        int count=1,number=nums[0],max=0;
        //find most repeared value
        for(int i=1;i<temp.length;i++){
            if(temp[i] != temp[i-1]){
                count=1;
            }else count++;
            if(count>max){
                max=count;
                number=temp[i];
            };
        }
        //2 pointers to checck first and last
        int left=0,right=nums.length-1;
        for(int i=0;i<nums.length; i++) {
            if(nums[left] != number) left++;
            if(nums[right] != number) right--;
            if(nums[right] == number && nums[left] == number) break;
        }
        return right-left+1;
    }
}
