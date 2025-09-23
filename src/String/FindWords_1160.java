package String;

public class FindWords_1160 {
    public int countCharacters(String[] words, String chars) {
        //build dict
        int[] dict = new int[26];
        for(char c : chars.toCharArray()){
            dict[c - 'a']++;
        }
        //count
        int count = 0;
        for(String word : words){
            //build dict for word
            int[] w_dict = new int[26];
            boolean isValid = true;
            for(char c : word.toCharArray()){
                w_dict[c - 'a']++;
            }
            //check if valid or not
            for(char c : word.toCharArray()){
                if(dict[c - 'a'] == 0 || w_dict[c - 'a'] > dict[c - 'a']){
                    isValid = false;
                    break;
                }
            }
            if(isValid) count+= word.length() ;
        }
        return count;
    }
}
