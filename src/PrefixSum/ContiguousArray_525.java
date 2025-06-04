package PrefixSum;

public class ContiguousArray_525 {
    //
    public int findMaxLength(int[] nums) {
        //presum array
        int len = nums.length;
        //egde cases
        if (len == 1) return 0;
        int max=0;
        //if((len == 2 ) return 1;
        int[] presum = new int[len];
        //
        presum[0] = nums[0];
        for (int i = 1; i < len; i++) {
            presum[i] = presum[i - 1] + nums[i];
            if((i&1)==1 && presum[i]*2==i+1) max=Math.max(max,i+1);
        }
        //
        for(int i=1;i<len-1;i++){
            //
            for(int j=i+1;j<len;j+=2){
                int length = j-i+1;
                int sum = presum[j] - presum[i-1];
                if(sum*2 == length) max=Math.max(max,length);
            }
        }
        return max;
    }
    //
}
