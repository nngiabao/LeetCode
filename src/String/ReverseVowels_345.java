package String;

import java.util.*;

public class ReverseVowels_345 {
    public static void main(String[] args) {
        String s =  "IceCreAm";
        System.out.println(reverseVowels2(s));
    }

    //Solution 1: Using stack to reverse
    public static String reverseVowels(String s){
        //create a list of wovels
        List<Character> wovels = new LinkedList<>(Arrays.asList('a','e','i','o','u'));
        Stack<Character> stack = new Stack<>();
        //put into stack
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(wovels.contains(Character.toLowerCase(c))) stack.push(c);
        }
        //reverse it
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(wovels.contains(Character.toLowerCase(c))){
                sb.append(stack.pop());
            }else sb.append(c);
        }
        return sb.toString();
    }

    //Solution 2:Using 2 pointers
    public static String reverseVowels2(String s){
        //create a list of wovels
        List<Character> wovels = new LinkedList<>(Arrays.asList('a','e','i','o','u'));
        //2 pointers
        int i=0,j=s.length()-1;
        //flag
        boolean f_i=false,f_j=false;
        //cuz String in java is immutable
        //we have to transfer to char array
        char[] res = s.toCharArray();

        while(i<=j){
            char c_i = s.charAt(i);
            char c_j = s.charAt(j);
            //check flag
            f_i = (wovels.contains(Character.toLowerCase(c_i))) ? true : false;
            f_j = (wovels.contains(Character.toLowerCase(c_j))) ? true : false;
            //
            if(f_i && f_j){
                //swap
                char temp;
                temp = res[i];
                res[i] = res[j];
                res[j] = temp;
                i++;
                j--;
            }else if(f_i) j--;
            else i++;
        }
        return new String(res);
    }

    //Optimize Solution 2
    public String reverseVowels3(String s) {
        Set<Character> vowels = new HashSet<>(Arrays.asList(
                'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        char[] res = s.toCharArray();
        int i = 0, j = s.length() - 1;
        while (i < j) {
            while (i < j && !vowels.contains(res[i])) i++;
            while (i < j && !vowels.contains(res[j])) j--;
            // Swap vowels
            char temp = res[i];
            res[i] = res[j];
            res[j] = temp;
            i++;
            j--;
        }
        return new String(res);
    }

}
