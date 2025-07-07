package String;

import java.math.BigInteger;

public class MulStrings_43 {
    //Solution 1:
    public String multiply(String num1, String num2) {
        return String.valueOf(Long.parseLong(num1)*Long.parseLong(num2));
    }
    //Solution 2:Using BigInteger class - slower
    public String multiply2(String num1, String num2) {
        // Convert the strings to BigInteger
        BigInteger n1 = new BigInteger(num1);
        BigInteger n2 = new BigInteger(num2);

        // Multiply the BigIntegers and return the result as a string
        return n1.multiply(n2).toString();
    }
    //Solution 3:
}
