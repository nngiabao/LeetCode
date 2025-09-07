package SlidingWindow;

import java.util.*;

public class NumberOfSubstring_1358 {
    //Solution 1:Using 2 pointers
    public int numberOfSubstrings(String s) {
        int a = 0, b = 0, c = 0, left = 0, result = 0;
        for (int right = 0; right < s.length(); right++) {
            // Count current character
            char ch = s.charAt(right);
            if (ch == 'a') a++;
            else if (ch == 'b') b++;
            else if (ch == 'c') c++;

            // Shrink window from left as much as possible while keeping all three characters
            while (a > 0 && b > 0 && c > 0) {
                char leftChar = s.charAt(left);
                if (leftChar == 'a') a--;
                else if (leftChar == 'b') b--;
                else if (leftChar == 'c') c--;
                left++;
            }
            // Add number of valid substrings ending at 'right'
            result += left;
        }
        return result;
    }
}
