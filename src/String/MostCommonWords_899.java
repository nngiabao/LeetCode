package String;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class MostCommonWords_899 {
    public static void main(String[] args) {
        String a = "Bob. hIt, baLl";
        String [] banned = {"bob", "hit"};
        /*System.out.println( a.split("\\W+"));
        for(String word : a.split("\\W+")) {
            System.out.println(word);
        }*/
        System.out.println(mostCommonWord(a,banned));
    }

    public static String mostCommonWord(String paragraph, String[] banned) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        String [] words = paragraph.split("\\W+");
        String word;
        //create commonWord
        String commonWord=null;
        //map.put(commonWord,1);
        // Convert the banned array to a HashSet
        HashSet<String> bannedSet = new HashSet<>(Arrays.asList(banned));
        // check the loop
        for(int i = 0; i < words.length; i++) {
            word = words[i].toLowerCase();
            if(!bannedSet.contains(word)){
                map.put(word, map.getOrDefault(word, 0) + 1);
                if(commonWord == null){
                    commonWord = word;
                }else{
                    if(map.get(word) > map.get(commonWord)) commonWord = words[i].toLowerCase();
                }
            }
        }
        return commonWord;
    }
}

/* Other fasest solution
class Solution {
    private static final int SIZE = 0b100, MASK = 0b11111, LOWER = 0b100000;
    private final int[] frequencies = new int[LOWER];
    private final boolean[] isBanned = new boolean[LOWER];

    public String mostCommonWord(String paragraph, String[] banned) {
        for (String w : banned) {
            isBanned[hash(w) & MASK] = true;
        }

        Token t = new Token(paragraph);
        int freq = 0;
        Pair maxWordIndices = null;

        while (t.hasNext()) {
            Pair indices = t.next();
            int start = indices.start;
            int end = indices.end;

            int index = hash(paragraph, start, end) & MASK;
            if (!isBanned[index]) {
                int frequency = ++frequencies[index];
                if (frequency > freq) {
                    freq = frequency;
                    maxWordIndices = indices;
                }
            }
        }

        return toLowerCase(paragraph, maxWordIndices.start, maxWordIndices.end);
    }

    static class Token {
        private static final boolean[] letters = new boolean[123];
        private final String paragraph;
        private int index = 0;
        private final int len;

        public Token(String paragraph) {
            this.paragraph = paragraph;
            this.len = paragraph.length();
        }

        static {
            for (int i = 97; i <= 122; i++) {
                letters[i] = true;
                letters[i - LOWER] = true;
            }
        }

        public Pair next() {
            int start = index;
            while (start < len && !isLetter(paragraph.charAt(start))) {
                start++;
            }
            index = start;
            while (index < len && isLetter(paragraph.charAt(index))) {
                index++;
            }
            return new Pair(start, index);
        }

        public boolean hasNext() {
            while (index < len && !isLetter(paragraph.charAt(index))) {
                index++;
            }
            return index < len;
        }

        private boolean isLetter(char c) {
            return c < letters.length && letters[c];
        }
    }

    public static int hash(String s) {
        int length = Math.min(s.length(), SIZE), hash = 0;
        for (int i = 0; i < length; i++) {
            hash = (hash << SIZE) - hash + s.charAt(i);
        }
        return hash;
    }

    public static int hash(String s, int start, int end) {
        int length = Math.min(end - start, SIZE), hash = 0;
        for (int i = 0; i < length; i++) {
            hash = (hash << SIZE) - hash + toLowerCase(s.charAt(start + i));
        }
        return hash;
    }

    private static char toLowerCase(char c) {
        return c >= 'a' ? c : (char) (c + LOWER);
    }

    private static String toLowerCase(String s, int start, int end) {
        char[] wordLower = new char[end - start];
        for (int i = 0; i < end - start; i++)
            wordLower[i] = toLowerCase(s.charAt(start + i));
        return new String(wordLower);
    }


    static class Pair {
        public final int start, end;
        public Pair(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
}
 */