package Math;

public class CountMatchesInTourament_1688 {
    //Solution 1:
    public int numberOfMatches(int n) {
        int totalMatches = 0;
        while (n > 1) {
            if ((n & 1) == 1) { // odd
                totalMatches += (n - 1) / 2;
                n = (n - 1) / 2 + 1;
            } else { // even
                totalMatches += n / 2;
                n = n / 2;
            }
        }
        return totalMatches;
    }
    //Solution 2:math
    public int numberOfMatches2(int n) {
        return n-1;
    }
}
