package Bit;

public class CountingBits_338 {
    public int[] countBits(int n) {
        int[] res = new int[n + 1];
        for(int i=0;i<=n;i++){
            //this is DP formula
            //when we want to count 1's bit
            //we shift to the right 1 bit to find number of bit it from
            //then we will extract and add last bit
            //=> get answer
            res[i] = res[i>>1]+ (i&1);
        }
        return res;
    }
    //Solution 2
    //using recursion to check
    public void helper(int[] ans,int count,int n){
        if(n>=ans.length) return;
        ans[n] = count;
        n=n<<1;
        helper(ans,count+1,n+1);
        helper(ans,count,n);
    }
    public int[] countBits2(int n) {
        int ans[] = new int[n+1];
        helper(ans,1,1);
        return ans;
    }
}
