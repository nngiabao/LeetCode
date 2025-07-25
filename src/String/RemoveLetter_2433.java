package String;

public class RemoveLetter_2433 {
    public boolean equalFrequency(String word) {
        //put into dic
        int[] freq = new int[26];
        for(int i = 0; i < word.length(); i++) {
            freq[word.charAt(i) - 'a']++;
        }
        int count = -1;
        //check gapif gap > 2
        for(int i = 0; i < 26; i++) {
            if(freq[i] != 0){
                if(count == -1) count = freq[i];
                else{
                    if(count != freq[i]-1) return false;
                }
            }
        }
        return true;
    }
}
