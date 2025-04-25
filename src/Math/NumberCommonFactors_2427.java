package Math;

public class NumberCommonFactors_2427 {
    public int commonFactors(int a, int b) {
        int count=0;
        int gcd = gcd(a,b);
        for(int i=a;i<=gcd;i++){
            if(gcd%i==0 ) count++;
        }
        return count;
    }

    public int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

}
