package Array;

public class SortArrayByParity_905 {
    public static void main(String[] args) {
        System.out.println(sortArrayByParity(new int[]{3,1,2,4}));
    }
    public static int[] sortArrayByParity(int[] nums) {
        if(nums.length == 1) return nums;
        int i = 0, j = 0;
        while(i<nums.length-1 && j<nums.length) {
            if((nums[i] & 1) == 0){
                i++;
                j=i+1;
            }else{
                while(j<nums.length && (nums[j] & 1) != 0) j++;
                //swap
                if(j<nums.length) {
                    //we should have this edge otherwise it will be error
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    i++;
                }
            }
        }
        return nums;
    }
}
