package Trie;

import java.util.*;
public class ReplaceWords_648 {
    //Solution 1:Brute-force
    public String replaceWords(List<String> dictionary, String sentence) {
        Collections.sort(dictionary, (a, b) -> a.length() - b.length()); // shortest root first
        String[] split = sentence.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String s : split) {
            for (String root : dictionary) {
                if (check(s, root)) {
                    s = root;
                    break;
                }
            }
            sb.append(s).append(" ");
        }

        return sb.toString().trim();
    }

    boolean check(String s, String root) {
        if (s.length() < root.length()) return false;//check if s len < root len
        for (int i = 0; i < root.length(); i++) {
            if (root.charAt(i) != s.charAt(i)) return false;
        }
        return true;
    }
    //Solution 2:Trie redo again - not done
    // Trie Node class
    static class TrieNode {
        Map<Character, TrieNode> children = new HashMap<>();
        String word = null; // non-null if this node is the end of a root
    }

    public String replaceWords2(List<String> dictionary, String sentence) {
        // 1. Build Trie from dictionary
        TrieNode root = new TrieNode();
        for (String dictWord : dictionary) {
            TrieNode node = root;
            for (char c : dictWord.toCharArray()) {
                node = node.children.computeIfAbsent(c, k -> new TrieNode());
            }
            node.word = dictWord; // mark the end of a root
        }

        // 2. Process each word in the sentence
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            TrieNode node = root;
            String replacement = word;

            for (char c : word.toCharArray()) {
                if (!node.children.containsKey(c) || node.word != null) break;
                node = node.children.get(c);
            }

            if (node.word != null) {
                replacement = node.word; // found a root
            }

            result.append(replacement).append(" ");
        }

        return result.toString().trim();
    }

}
