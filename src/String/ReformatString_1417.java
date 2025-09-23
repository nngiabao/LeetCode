package String;

public class ReformatString_1417 {
    public String reformat(String s) {
        //build digit and alpha
        StringBuilder letter = new StringBuilder();
        StringBuilder digit = new StringBuilder();
        //
        for (int i = 0; i < s.length(); i++) {
            //
            char c = s.charAt(i);
            //
            if (Character.isLetter(c)) {
                letter.append(c);
            } else {
                digit.append(c);
            }
        }
        //build
        //check if the gap > 1 => emtry String
        int letter_len = letter.length();
        int digit_len = digit.length();
        if (Math.abs(letter_len - digit_len) > 1) return "";
        //else start with larger
        StringBuilder sb = new StringBuilder();
        //build res
        int i = 0;
        //check which start first
        boolean digitFirst = (digit_len >= letter_len) ? true : false;
        while (i < s.length() / 2) {
            if (digitFirst) {
                sb.append(digit.charAt(i));
                sb.append(letter.charAt(i));
            } else {
                sb.append(letter.charAt(i));
                sb.append(digit.charAt(i));
            }
            i++;
        }
        if (i < letter_len) {
            sb.append(letter.charAt(i));
        } else if (i < digit_len) sb.append(digit.charAt(i));
        return sb.toString();
    }
}
