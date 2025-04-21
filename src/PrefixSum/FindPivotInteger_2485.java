package PrefixSum;

public class FindPivotInteger_2485 {
    public int pivotInteger(int n) {
        if(n==1) return 1;
        //prefix sum array
        int[] presum = new int[n];
        presum[0] = 1;
        for(int i=1;i<n;i++){
            presum[i] = presum[i-1]+i+1;
        }
        //
        for(int i=0;i<n;i++){
            //edge case
            int left = (i==0) ? 0 :presum[i-1];
            int right = presum[n-1]-presum[i];
            if(left == right) return i+1;
        }
        return -1;
    }
}
