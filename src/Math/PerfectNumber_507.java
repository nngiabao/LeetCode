package Math;

public class PerfectNumber_507 {
    //Solution 1: O(n)
    public boolean checkPerfectNumber(int num) {
        if(num==1) return false;
        int sum=1;
        for(int i=2;i<num;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        return (sum == num) ? false : true;
    }
    //Solution 2: O(logn) - check divisor until square root
    //i.e: root(28)
    //(1,28),(2,14),(4,7)
    //=> 1+2+4+7+14 = 28
    public boolean checkPerfectNumber2(int num) {
        if(num==1) return false;
        int sum = 1;
        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) {
                sum += i;
                sum += num/i;
            }
        }
        return (sum == num ) ? true : false;
    }
}
