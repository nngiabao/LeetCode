package Backtracking;

public class CountNumWithUniqueDigit_357 {
    public int countNumbersWithUniqueDigits(int n) {
        //
        if(n == 0) return 1;
        //
        int count=0;
        backtracking(count,n,1);
        return count;
    }
    //
    void backtracking(int count,int n,int currentDigit){

    }
}
