package Array;

public class ConcatenationArray_1929 {
    //Solution 1:Using array
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int[] res = new int[2*len];
        for(int i = 0; i < res.length; i++){
            res[i] = nums[i%len];
        }
        return res;
    }
    //Solution 2 : Using copy function
    public int[] getConcatenation2(int[] nums){
        int len = nums.length;
        int[] res = new int[2*len];
        System.arraycopy(nums, 0, res, 0, len);
        System.arraycopy(nums, 0, res, len, len);
        return res;
    }
}
