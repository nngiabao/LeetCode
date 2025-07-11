package Bit;

public class PrimeNumBinRepresent_762 {
    //SOlution 1: TLE
    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        while(left != right) {
            if(isPrime(Integer.bitCount(left))) count++;
        }
        return count++;
    }
    //build method check prime
    boolean isPrime(int n){
        if (n <= 1) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;

        // Check from 5 to sqrt(n), skipping even numbers
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }

    //Solution 2:Using Bit manipulation
}
