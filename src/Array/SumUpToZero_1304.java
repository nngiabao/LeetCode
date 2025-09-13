package Array;

public class SumUpToZero_1304 {
    public int[] sumZero(int n) {
        if(n==1) return new int[]{0};
        //
        int[] res = new int[n];
        int i=0;
        if((n&1)==1){
            res[0] = 0;
            i++;
        }
        int num=1;
        while(i<n){
            //
            res[i] = num;
            res[i+1] = -num;
            i+=2;num++;
        }
        return res;
    }
}
