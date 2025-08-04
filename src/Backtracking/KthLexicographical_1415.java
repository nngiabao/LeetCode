package Backtracking;

import java.util.*;
//
public class KthLexicographical_1415 {
    private int count = 0;
    private String result = "";

    public String getHappyString(int n, int k) {
        dfs(n, k, "", ' '); // Start with empty string and no previous character
        return result;
    }

    private void dfs(int n, int k, String current, char prevChar) {
        if (current.length() == n) {
            count++;
            if (count == k) {
                result = current;
            }
            return;
        }

        for (char ch : new char[] {'a', 'b', 'c'}) {
            if (ch != prevChar) {
                dfs(n, k, current + ch, ch);
                if (!result.isEmpty()) return; // Early stop once found
            }
        }
    }
}
