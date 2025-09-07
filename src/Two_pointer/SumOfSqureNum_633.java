package Two_pointer;

public class SumOfSqureNum_633 {
    public boolean judgeSquareSum(int c) {
        //
        int a = 0, b = (int) Math.floor(Math.sqrt(c));
        //

        while(a <= b){
            int sum = a*a + b*b;
            if(sum == c) return true;
            else if(sum<c){
                a++;
            }else b--; // if sum < c
        }
        //
        return false;
    }
}
