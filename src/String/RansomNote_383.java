package String;

import java.util.HashMap;

public class RansomNote_383 {
    public static void main(String[] args) {
        String a="aa";
        String b="ab";

        System.out.println(canConstruct2(a,b));
    }
    //Solution 1: use array 26 cuz only lowercase letter
    //convert into char array
    public boolean canConstruct(String ransomNote, String magazine) {
        //put into array to check
        int [] a_char = new int[26];
        //put into array
        for(int i = 0; i < magazine.length(); i++){
            a_char[ransomNote.charAt(i) - 'a']++;
        }
        //check Note
        for(int i = 0; i < ransomNote.length(); i++){
            if(a_char[ransomNote.charAt(i) - 'a'] == 0) return false;
            else a_char[ransomNote.charAt(i) - 'a']--;
        }
        return true;
    }

    //Save into
    //Solution 2:Hash Map - suck
    public static boolean canConstruct2(String ransomNote, String magazine){
        HashMap<Character,Integer> map = new HashMap<>();
        //put into map to check
        for(int i = 0; i < magazine.length(); i++){
            char ch = magazine.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        //check Note string
        for(int i = 0; i < ransomNote.length(); i++){
            char ch = ransomNote.charAt(i);
            //map.put(ch,map.getOrDefault(ch,0)-1);
            if(map.containsKey(ch)){
                if(map.get(ch)==0) return false;
                map.put(ch,map.get(ch)-1);
            }else return false;
        }
        return true;
    }
}
