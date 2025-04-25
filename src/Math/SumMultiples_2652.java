package Math;

public class SumMultiples_2652 {
    //Solution 1: brute force
    public int sumOfMultiples(int n) {
        if(n<3) return 0;
        int sum = 0;
        for(int i=3;i<=n;i++){
            if(i%7==0 || i%5==0 || i%3==0) {
                sum += i;
            }
        }
        return sum;
    }
    //Solution 2:Using inclusive-exclusive formula
    public int sumOfMultiples2(int n) {
        return sumDivisor(n,3) + sumDivisor(n,5) + sumDivisor(n,7)
                - sumDivisor(n,15) - sumDivisor(n,35) - sumDivisor(n,105) - sumDivisor(n,21);
    }

    public int sumDivisor(int n,int k) {
        int m = n/k; // integer division => n = k*m
        return k*m*(m+1)/2;
    }
}
