package String;

public class RedistributeCharacters_1897 {
    //Solution 1:Brute-force
    //check all freq of characters in words
    public boolean makeEqual(String[] words) {
        //freq of characters has to be the same =>
        //build dictionary
        int[] dict = new int[26];
        for(String word : words){
            for(Character c : word.toCharArray()){
                dict[c - 'a']++;
            }
        }
        //check if every is can distribute into every word
        int len = words.length;
        for(int i=0;i<26;i++){
            if(dict[i]%len != 0) return false;
        }
        return true;
    }
    //Solution 2:
    public boolean makeEqual2(String[] words) {
        return false;
    }
}
