package SlidingWindow;

public class MinOperationsMakeBin_3191 {
    public static void main(String[] args) {

    }
    public int minOperations(int[] nums) {
        int len = nums.length;
        int count = 0;
        for(int i=0;i<len;i++){
            if(nums[i] == 0){
                //check ed
                if(i + 2 > len-1 || i + 1 > len-1) return -1;
                nums[i] = 1;
                nums[i+1] = (nums[i+1] == 0) ? 1 : 0;
                nums[i+2] = (nums[i+2] == 0) ? 1 : 0;
                count++;
            }
        }
        //
        return count;
    }
}
