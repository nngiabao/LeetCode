package Recursion;

public class Fibonacci_509 {
    public static void main(String[] args) {

    }
    public int fib(int n) {
        if (n==0) return 0;
        if (n==1) return 1;
        return fib(n-1) + fib(n-2);
    }
}
