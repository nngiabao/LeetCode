package PrefixSum;

public class FindHighestAltitude_1732 {
    public int largestAltitude(int[] gain) {
        int[] presum = new int[gain.length];
        int max = 0;
        presum[0] = gain[0];
        max = Math.max(max, presum[0]);
        //
        for(int i=1;i<gain.length;i++){
            presum[i] = presum[i-1]+gain[i];
            max = Math.max(max,presum[i]);
        }
        return max;
    }
}
