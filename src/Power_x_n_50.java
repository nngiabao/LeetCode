public class Power_x_n_50 {
    public static void main(String[] args) {
        System.out.println(myPower(2,-2));
        System.out.println((double)1/4);
    }

    //run time overflow
    public static double myPower(double x, int n) {
        if ( n == 1) return x;
        if (n==-1) return 1/x;
        if(n < 0) return (double)1/x*myPower(x, n+1 );
        return x*myPower(x, n-1 );
    }
}
