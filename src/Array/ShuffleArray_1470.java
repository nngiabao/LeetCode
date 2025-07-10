package Array;

public class ShuffleArray_1470 {
    public int[] shuffle(int[] nums, int n) {
        int len = nums.length;
        int [] res = new int[len];
        //
        int j = ((len&1)==1) ? len/2+1 : len/2;
        int i=0;
        for(int index = 0; i < len; index+=2){
            res[index] = nums[i++];
            res[index] = nums[j++];
        }
         //
        return res;
    }
}
