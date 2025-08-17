package String;

import java.util.*;
import java.util.PriorityQueue;

public class SortVowels_2785 {
    //Solution 1:Using priority queue
    public String sortVowels(String s) {
        //
        PriorityQueue<String> pq = new PriorityQueue();
        //put it into pq if vowels
        List<Character> vowels = List.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        for (char c : s.toCharArray()) {
            if (vowels.contains(c)) pq.offer(String.valueOf(c));
        }
        //Build the string
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (vowels.contains(c)) {
                sb.append(pq.poll());
            } else sb.append(c);
        }
        return sb.toString();
    }

    //Solution 2:Using cage (best - not done)
    public String sortVowels2(String s) {
        int[] vowelCount = new int[11];
        int[] countIndexMap = new int[128];
        char[] result = s.toCharArray();
        char[] charMap = "AEIOUaeiou".toCharArray();
        for (int i = 0; i < charMap.length; i++) countIndexMap[charMap[i]] = i + 1;
        for (char c : result) vowelCount[countIndexMap[c]]++;
        int j = 1;
        int i = 0;
        while (j < vowelCount.length) {
            if (vowelCount[j] > 0) while (i < result.length) {
                if (countIndexMap[result[i]] == 0) {
                    i++;
                    continue;
                }
                vowelCount[j]--;
                result[i++] = charMap[j - 1];
                break;
            }
            else j++;
        }
        return new String(result);
    }
}
