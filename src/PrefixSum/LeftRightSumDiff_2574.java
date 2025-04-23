package PrefixSum;

public class LeftRightSumDiff_2574 {
    public static void main(String[] args) {
        LeftRightSumDiff_2574 a= new LeftRightSumDiff_2574();
        int[] nums = {10,4,8,3};
        System.out.println(a.leftRightDifference(nums));
    }
    //Solution 1: basic prefix sum
    public int[] leftRightDifference(int[] nums) {

        //find presum array
        if (nums.length == 1) return new int[0];
        //
        int length = nums.length;
        int[] presumLeft = new int[length];
        presumLeft[0] = 0;
        int[] presumRight = new int[length];
        presumRight[length - 1] = 0;
        int[] res = new int[length];

        for (int i = 1; i < length; i++) {
            //
            presumLeft[i] = presumLeft[i-1] + nums[i-1];
            presumRight[length-i-1] = presumRight[length-i] + nums[length-i];
            //
        }
        //put abs(right-left) into res[]
        for(int i=0;i<length;i++){
            res[i] = Math.abs(presumLeft[i] - presumRight[i]);
        }
        return res;
    }
    
}
