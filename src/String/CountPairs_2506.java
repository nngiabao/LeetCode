package String;

import java.util.HashSet;
import java.util.Set;

public class CountPairs_2506 {
    public int similarPairs(String[] words) {
        int len = words.length;
        int pairs = 0;

        // Represent each word as a bitmask of its characters
        int[] masks = new int[len];
        for (int i = 0; i < len; i++) {
            int mask = 0;
            for (char c : words[i].toCharArray()) {
                mask |= 1 << (c - 'a');
            }
            masks[i] = mask;
        }

        // Count pairs with same mask
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (masks[i] == masks[j]) {
                    pairs++;
                }
            }
        }
        return pairs;
    }
    //Solution 2:Using hashmap - better
    public int similarPairs2(String[] words) {
        //not done
        return 1;
    }
}
