package Sorting;

import java.util.Arrays;

public class RearrangeWords_1451 {
    public static void main(String[] args) {
        RearrangeWords_1451 a = new RearrangeWords_1451();
        a.arrangeWords("Leetcode cool is");
    }
    //
    public String arrangeWords(String text) {
        String[] words = text.split(" ");
        //edge case
        if(words.length == 1) return text;
        //we have to custom the comparator
        Arrays.sort(words, (a,b) -> a.length() - b.length());
        //
        StringBuilder sb = new StringBuilder();
        for(String word : words) {
            sb.append(word+" ");
        }
        String result = sb.toString().trim().toLowerCase();
        return result.substring(0,1).toUpperCase()+result.substring(1);
    }
    //Solution 2:
}
