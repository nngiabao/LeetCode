package Array;

public class MaxNumPairs_2341 {
    public int[] numberOfPairs(int[] nums) {
        //put into dict
        int[] res = new int[]{0,1};
        int len = nums.length;
        if(len == 1) return res;
        int[] dict = new int[101];
        //
        for(int num : nums) {
            dict[num]++;
        }
        //count
        int pairs=0,left=0;
        for(int i=0;i<101;i++){
            pairs+= dict[i]/2;
            left+= dict[i]%2;
        }

        //
        return new int[]{pairs,left};
    }
}
