package String;

public class StringToInt_8 {
    //Solution 1: not handling signed number
    public int myAtoi(String s) {
        //whitespace => skip
        //non-digit => return 0
        //if
        boolean isDigitRead = false;
        boolean isSignedRead = false;
        boolean isNegative = false;
        //boolean is
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            //skip leading space first
            if (c == ' ' && !isDigitRead && !isSignedRead) {
                continue; // skip leading spaces
            }
            //check if start with '-' or '+'
            //we have to check 2 things first ?
            // digit or non-digit
            //1. check singed
            if ((c == '-' || c == '+') && !isDigitRead && !isSignedRead) {
                isSignedRead = true;
                if (c == '-') isNegative = true;
            } else if (Character.isDigit(c)) {
                //res = res * 10 + (c - '0'); => make it overflow
                //round check - overflow
                int digit = c - '0';
                if (res > (Integer.MAX_VALUE - digit) / 10)
                    return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                //if not overflow
                res = res * 10 + digit;
                isDigitRead = true;
            } else break;//non-digit
        }
        return isNegative ? -res : res;
    }

    //
}
