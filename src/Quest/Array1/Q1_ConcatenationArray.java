package Quest.Array1;

public class Q1_ConcatenationArray {
    public int[] getConcatenation(int[] nums) {
        //
        int len = nums.length;
        int[] result = new int[len*2];
        //
        for(int i = 0; i < result.length; i++){
            result[i] = nums[i%len];
        }
        //
        return result;
    }
}
