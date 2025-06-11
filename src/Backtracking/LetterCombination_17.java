package Backtracking;

import java.util.*;

public class LetterCombination_17 {
    
    // FIXED VERSION: Proper backtracking implementation
    public List<String> letterCombinations2(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) return result;
        
        // Phone number mapping
        String[] mapping = {
            "",     // 0
            "",     // 1  
            "abc",  // 2
            "def",  // 3
            "ghi",  // 4
            "jkl",  // 5
            "mno",  // 6
            "pqrs", // 7
            "tuv",  // 8
            "wxyz"  // 9
        };
        
        backtrack2(digits, 0, new StringBuilder(), result, mapping);
        return result;
    }
    
    private void backtrack2(String digits, int index, StringBuilder current,
                          List<String> result, String[] mapping) {
        // BASE CASE: We've processed all digits
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }
        
        // Get current digit and its corresponding letters
        int digit = digits.charAt(index) - '0';
        String letters = mapping[digit];
        
        // Try each letter for the current digit
        for (char letter : letters.toCharArray()) {
            // 1. CHOOSE: Add the letter to our current combination
            current.append(letter);
            
            // 2. EXPLORE: Move to the next digit
            backtrack2(digits, index + 1, current, result, mapping);
            
            // 3. UNCHOOSE: Remove the letter (backtrack)
            current.deleteCharAt(current.length() - 1);
        }
    }
    
    // Alternative implementation using HashMap (like your original attempt)
    public List<String> letterCombinationsHashMap(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) return result;
        
        // Dictionary mapping (like your original)
        HashMap<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        
        backtrackWithMap(digits, 0, new StringBuilder(), result, map);
        return result;
    }
    
    private void backtrackWithMap(String digits, int index, StringBuilder current,
                                 List<String> result, HashMap<Character, String> map) {
        // BASE CASE
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }
        // Get letters for current digit
        char digit = digits.charAt(index);
        String letters = map.get(digit);
        // Try each letter
        for (char letter : letters.toCharArray()) {
            current.append(letter);                               // CHOOSE
            backtrackWithMap(digits, index + 1, current, result, map); // EXPLORE
            current.deleteCharAt(current.length() - 1);          // UNCHOOSE
        }
    }
    
    // Test method
    public static void main(String[] args) {
        LetterCombination_17 solution = new LetterCombination_17();

        System.out.println("=== LETTER COMBINATIONS ===");
        System.out.println("Input: \"23\"");
        System.out.println("Output: " + solution.letterCombinations("23"));
        System.out.println("Expected: [ad, ae, af, bd, be, bf, cd, ce, cf]");

        System.out.println("\nInput: \"\"");
        System.out.println("Output: " + solution.letterCombinations(""));

        System.out.println("\nInput: \"2\"");
        System.out.println("Output: " + solution.letterCombinations("2"));

        System.out.println("\nInput: \"2345678901\""); // 10-digit input
        System.out.println("Output: " + solution.letterCombinations("2345678901"));
    }

    //do again
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) return result;

        String[] mapping = {
                "",     // 0
                "",     // 1
                "abc",  // 2
                "def",  // 3
                "ghi",  // 4
                "jkl",  // 5
                "mno",  // 6
                "pqrs", // 7
                "tuv",  // 8
                "wxyz"  // 9
        };

        backtrack(digits, 0, new StringBuilder(), result, mapping);
        return result;
    }

    //backtrack method
    //1st parameter:the array has to go through
    //2nd parameter:start index
    //3rd parameter:temp sb
    //4th parameter:result
    //5th parameter: dictionary
    public void backtrack(String digits,int index,StringBuilder temp,List<String> result,String[] dictionary){
        //base case
        if(index == digits.length()){
            result.add(temp.toString());
            return;
        }

        //get from current digit
        int current_index = digits.charAt(index)-'0';
        char c = dictionary[current_index].charAt(0);

        // Get current digit and its corresponding letters
        int digit = digits.charAt(index) - '0';
        String letters = dictionary[digit];

        // Try each letter for the current digit
        for (char letter : letters.toCharArray()) {
            // 1. CHOOSE: Add the letter to our current combination
            temp.append(letter);

            // 2. EXPLORE: Move to the next digit
            backtrack2(digits, index + 1, temp, result, dictionary);

            // 3. UNCHOOSE: Remove the letter (backtrack)
            temp.deleteCharAt(temp.length() - 1);
        }
    }
}
