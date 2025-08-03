package String;

public class CheckBalancedString_3340 {
    public boolean isBalanced(String num) {
        //
        int sumEven = 0;
        int sumOdd = 0;
        ///
        for (int i = 0; i < num.length(); i += 2) {
            sumEven += num.charAt(i) - '0';
        }
        ///
        for (int i = 1; i < num.length(); i += 2) {
            sumOdd += num.charAt(i) - '0';
        }
        //
        //
        return sumEven == sumOdd;
    }
}
