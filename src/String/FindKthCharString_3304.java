package String;

public class FindKthCharString_3304 {
    //Solution 1: Build recursion - hard
    public char kthCharacter(int k) {
        return findChar(k, getDepth(k));
    }

    // Get minimum number of steps (operations) needed so length ≥ k
    private int getDepth(int k) {
        int len = 1, depth = 0;
        while (len < k) {
            len *= 2; // each operation doubles the string
            depth++;
        }
        return depth;
    }

    // Recursively find the k-th character in depth-th version of the word
    private char findChar(int k, int depth) {
        if (depth == 0) return 'a'; // base case: "a"

        int half = 1 << (depth - 1); // length of previous word

        if (k <= half) {
            return findChar(k, depth - 1); // it's in the original half
        } else {
            char c = findChar(k - half, depth - 1); // from previous, then transform
            return nextChar(c);
        }
    }

    // Helper to get the next character in alphabet, 'z' → 'a'
    private char nextChar(char c) {
        return (c == 'z') ? 'a' : (char)(c + 1);
    }

    //Solution 2:Simulation
    public char kthCharacter2(int k) {
        StringBuilder word = new StringBuilder("a");

        // Keep growing the word until it's long enough
        while (word.length() < k) {
            int len = word.length();
            StringBuilder next = new StringBuilder();

            // Build the transformed part (next chars)
            for (int i = 0; i < len; i++) {
                next.append(nextChar2(word.charAt(i)));
            }

            // Append it to the original word
            word.append(next);
        }

        // Return the k-th character (1-based index)
        return word.charAt(k - 1);
    }

    // Helper to get next character, wrapping from 'z' to 'a'
    private char nextChar2(char c) {
        return (c == 'z') ? 'a' : (char)(c + 1);
    }
}
