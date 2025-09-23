package Math;

public class ConvertTwoNoZeroIntegers_1317 {
    public int[] getNoZeroIntegers(int n) {
        //
        for(int i=1;i<=n/2;i++){
            if(check(i) && check(n-i)) return new int[]{-1, -1};
        }
        //
        //

        return new int[]{-1, -1};
    }
    //check method
    boolean check(int n){
        while(n>0){
            if(n%10 == 0) return false;
            n /=10;
        }
        return true;
    }
}
