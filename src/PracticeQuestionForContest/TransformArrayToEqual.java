package PracticeQuestionForContest;

public class TransformArrayToEqual {
    public boolean canMakeEqual(int[] nums, int k) {
        int numPos = 0;
        int numNeg = 0;
        int len = nums.length;
        for(int i=0;i<len;i++){
            if(nums[i] > 0) numPos++;
            else numNeg++;
        }
        //
        if(numPos+k==len || numNeg+k==len) return true;
        return false;
    }
}
