package Two_pointer;

import java.util.Arrays;

public class SquaresSortedArray_977 {
    public static void main(String[] args) {
        SquaresSortedArray_977 a = new SquaresSortedArray_977();
        int []  c = {-7,-3,2,3,11};
        System.out.println(a.sortedSquares(c));
    }

    public int[] sortedSquares(int[] nums) {
        //Arrays.fill(nums, Math.pow());
        //square all of elements
        //if(nums.length == 1) return nums[0];
        int[] res = new int[nums.length];
        //using 2 pointers
        int i=0, j=nums.length-1,index=nums.length-1;
        while(i<=j){
            if(nums[i]*nums[i]<nums[j]*nums[j]){
                res[index] = nums[j]*nums[j];
                j--;
            }else{
                res[index] = nums[i]*nums[i];
                i++;
            }
            index--;
        }
        return res;
    }
}
