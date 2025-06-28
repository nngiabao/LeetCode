package String;

import java.util.HashSet;

public class CheckPangram_1832 {
    //Solution 1:Build dictionary
    public boolean checkIfPangram(String sentence) {
        //build dictionary
        int[] dict = new int[26];
        for(char c : sentence.toCharArray()){
            dict[c-'a']++;
        }
        //
        for(int freq : dict){
            if(freq == 0)  return false;
        }
        return true;
    }
    //Solution 2:Using hashset
    public boolean checkIfPangram2(String sentence) {
        //build dictionary
        HashSet<Character> dic = new HashSet<>();
        for(int i=0;i<sentence.length();i++){
            dic.add(sentence.charAt(i));
        }
        //
        return (dic.size()==26) ? true : false;
    }
    //Solution 3:Using alphabet
    public boolean checkIfPangram3(String sentence) {
        String alpha ="abcdefghijklmnopqrstuvwxyz";
        for(int i =0;i<alpha.length();i++){
            char temp = alpha.charAt(i);
            if (sentence.indexOf(temp)==-1) return false;

        }
        return true;
    }
}
