package Math;

public class DivAndNonDiv_2894 {
    public int differenceOfSums(int n, int m) {
        int sum = 0;
        for(int i = 1; i <= n; i++){
            if(i % m != 0) sum += i;
        }
        long total = n * (n+1)/2;
        return 2*sum - (int)total;
    }
    //Solution 2: the best
    public int differenceOfSums2(int n, int m) {
        int num1=0;
        for(int i=n;i>=1;i--){
            if(i%m == 0){
                num1= i/m;
                break;
            }
        }
        return (n*(n+1)/2)-(m*(num1)*(num1+1));
    }
}
