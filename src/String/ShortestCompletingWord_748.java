package String;

import java.util.HashMap;

public class ShortestCompletingWord_748 {
    public static void main(String[] args) {
        String licensePlate = "1s3 456";
        String [] words = {"looks","pest","stew","show"};
        System.out.println(shortestCompletingWord(licensePlate,words));
    }
    //hashmap
    public static String shortestCompletingWord(String licensePlate, String[] words) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        licensePlate.toLowerCase();
        char ch;
        for (int i = 0; i < licensePlate.length(); i++) {
            ch = licensePlate.charAt(i);
            if (97 < ch && ch < 122 ) {
                map.put(ch,map.getOrDefault(ch,1)+1);
            }
        }

        //check valid String
        for(String w : words){
            if(check(map,w)) return w;
        }
        return null;
    }

    public static boolean check(HashMap<Character,Integer> map, String word) {
        Character ch;
        for(int i = 0;i<word.length();i++){
            ch = word.charAt(i);
            if (map.get(ch) != null ){
                if(map.get(ch) == 0) return false;
                map.put(ch , map.get(ch)-1);
            }
        }
        return true;
    }

    //Solution 2
    public static String shortestCompletingWord2(String licensePlate, String[] words) {
        //put into array
        int [] arrayCh = new int[26];
        Character ch;
        for(int i = 0;i<licensePlate.length();i++){
            ch = licensePlate.charAt(i);
            if( 97 < ch && ch < 122 ) {
                arrayCh[ch-97]++;
            }
        }
        //check
        for (String w : words) {
            for (int i = 0; i < w.length(); i++) {
               // if( 97 < ch && ch < 122 ){
                //   arrayCh[ch-97]--;
              //  }
            }

        }

        return null;
    }
}
