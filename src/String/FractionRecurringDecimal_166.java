package String;

import java.util.*;
//
public class FractionRecurringDecimal_166 {

    public String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) return "0";

        StringBuilder res = new StringBuilder();

        // Handle sign
        if ((numerator < 0) ^ (denominator < 0)) {
            res.append("-");
        }

        // Convert to long to handle overflow
        long num = Math.abs((long) numerator);
        long den = Math.abs((long) denominator);

        // Integer part
        res.append(num / den);
        long remainder = num % den;

        if (remainder == 0) return res.toString();

        res.append(".");
        Map<Long, Integer> map = new HashMap<>();

        while (remainder != 0) {
            if (map.containsKey(remainder)) {
                res.insert(map.get(remainder), "(");
                res.append(")");
                break;
            }
            map.put(remainder, res.length());
            remainder *= 10;
            res.append(remainder / den);
            remainder %= den;
        }

        return res.toString();
    }

}
