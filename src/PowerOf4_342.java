public class PowerOf4_342 {
    public static void main(String[] args) {

    }

    public static boolean isPowerOfFour(int n) {
        if (n <= 0) return false;
        if(n == 1) return true;
        if(n >> 2 != 0) return false;
        return isPowerOfFour(n/4);
    }
}
