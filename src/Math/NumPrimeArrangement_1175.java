package Math;

public class NumPrimeArrangement_1175 {
    static final int MOD = 1_000_000_007;

    public int numPrimeArrangements(int n) {
        int p = countPrimes(n);
        return (int) (fact(p) * fact(n - p) % MOD);
    }

    private int countPrimes(int n) {
        int cnt = 0;
        for (int i = 2; i <= n; i++) if (isPrime(i)) cnt++;
        return cnt;
    }

    private boolean isPrime(int x) {
        for (int i = 2; i * i <= x; i++) if (x % i == 0) return false;
        return x > 1;
    }

    private long fact(int x) {
        long res = 1;
        for (int i = 2; i <= x; i++) res = res * i % MOD;
        return res;
    }
}
