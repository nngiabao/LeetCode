package String;

public class PartioningIntoMinNum_1689 {
    public int minPartitions(String n) {
        int maxDigit = 0;
        for (char c : n.toCharArray()) {
            int digit = c - '0';
            if (digit > maxDigit) {
                maxDigit = digit;
            }
            // Optimization: early exit if we hit 9
            if (maxDigit == 9) break;
        }
        return maxDigit;
    }
}
