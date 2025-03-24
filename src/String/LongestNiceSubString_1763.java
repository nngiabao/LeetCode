package String;

public class LongestNiceSubString_1763 {
    //Divive and COnmquer
    public String longestNiceSubstring(String s) {
        if (s.length() < 2) return "";

        // Create two boolean arrays for 26 lowercase and 26 uppercase letters
        boolean[] lower = new boolean[26];
        boolean[] upper = new boolean[26];

        for (char c : s.toCharArray()) {
            if (Character.isLowerCase(c)) {
                lower[c - 'a'] = true;
            } else if (Character.isUpperCase(c)) {
                upper[c - 'A'] = true;
            }
        }

        // Find the first character that breaks the "nice" condition
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int index = Character.toLowerCase(c) - 'a';

            if (lower[index] != upper[index]) {
                // Split around the bad character
                String left = longestNiceSubstring(s.substring(0, i));
                String right = longestNiceSubstring(s.substring(i + 1));
                return left.length() >= right.length() ? left : right;
            }
        }

        // If no bad character is found, the entire string is nice
        return s;
    }
}
