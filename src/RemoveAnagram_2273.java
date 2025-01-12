import java.util.ArrayList;
import java.util.List;

public class RemoveAnagram_2273 {
    public static void main(String[] args) {
        Integer a = null;
        System.out.println('b'-'a');

    }

    public List<String> removeAnagrams(String[] words) {
        //put word 1 into result
        List<String> result = new ArrayList<>();
        result.add(words[0]);
        //
        for(int i = 1; i < words.length; i++){
            if(!isAnagram(words[i], words[i-1])) result.add(words[i]);
        }
        return result;
    }

    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        //Sorted string
        Integer[] temp = new Integer[26];
        for(int i=0; i<s.length(); i++) {
            int index = s.charAt(i) - 'a';
            if(temp[index] == null){
                temp[index] = 1;
            }else{
                temp[index]++;
            }
        }
        //check if exist value different from 0 => false
        for(int i=0; i<t.length(); i++) {
            int index = t.charAt(i) - 'a';
            if(temp[index]==null || temp[index]==0) return false;
            temp[index]--;
        }
        return true;
    }
}
