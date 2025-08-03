package Heap;

import java.util.PriorityQueue;

public class ConstrcutString_2182 {
    public String repeatLimitedString(String s, int repeatLimit) {
        // Count frequency of each character
        int[] freq = new int[26];
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        // Max heap (reverse alphabetical order, 'z' has highest priority)
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int i = 25; i >= 0; i--) {
            if (freq[i] > 0) {
                pq.offer(i);
            }
        }

        StringBuilder sb = new StringBuilder();

        while (!pq.isEmpty()) {
            int curr = pq.poll(); // largest available character
            int use = Math.min(freq[curr], repeatLimit);

            // Add up to repeatLimit of current character
            for (int i = 0; i < use; i++) {
                sb.append((char) (curr + 'a'));
            }

            freq[curr] -= use;

            // If more of current char left, we need a breaker
            if (freq[curr] > 0) {
                if (pq.isEmpty()) break; // No other letter to break the streak

                int next = pq.poll(); // Use next largest char as breaker
                sb.append((char) (next + 'a'));
                freq[next]--;

                if (freq[next] > 0) pq.offer(next);
                pq.offer(curr); // Put current back for later
            }
        }

        return sb.toString();
    }
}
