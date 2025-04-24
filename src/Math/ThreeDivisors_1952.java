package Math;

public class ThreeDivisors_1952 {
    //Solution 1: Brute-force
    public boolean isThree(int n) {
        for(int i=2;i<=n/2;i++){
            if(n % i==0){
                return (n/i < n) ? false : true;
            }
        }
        return false;
    }
}
