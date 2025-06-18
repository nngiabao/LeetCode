package Trie;

public class ImplementTrie_208 {

    public class TrieNode{
        TrieNode[] children = new TrieNode[26];//a to z
        boolean isEndOfWord = false;
    }

    private TrieNode root;

    public ImplementTrie_208() {
        root = new TrieNode(); // root is an empty node
    }

    public void insert(String word) {
        TrieNode node = root;
        for (char ch : word.toCharArray()) {
            int i = ch - 'a';
            if (node.children[i] == null) {
                node.children[i] = new TrieNode();
            }
            node = node.children[i];
        }
        node.isEndOfWord = true;
    }

    public boolean search(String word) {
        TrieNode node = find(word);
        return node != null && node.isEndOfWord;
    }

    public boolean startsWith(String prefix) {
        return find(prefix) != null;
    }

    private TrieNode find(String str) {
        TrieNode node = root;
        for (char ch : str.toCharArray()) {
            int i = ch - 'a';
            if (node.children[i] == null) {
                return null;
            }
            node = node.children[i];
        }
        return node;
    }
}
