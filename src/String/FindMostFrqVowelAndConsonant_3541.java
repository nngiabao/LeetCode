package String;

public class FindMostFrqVowelAndConsonant_3541 {
    public int maxFreqSum(String s) {
        //build dictionary
        int[] freq = new int[26];
        for(char c : s.toCharArray()){
            freq[c - 'a']++;
        }
        //
        int maxVowel = 0;
        int maxConsonant = 0;
        for(int i=0; i<26; i++){
            if(i == 'a'-'a' || i == 'e'-'a' || i == 'i'-'a' || i == 'o'-'a' || i == 'u'-'a')
                maxVowel = Math.max(maxVowel, freq[i]);
            else maxConsonant = Math.max(maxConsonant, freq[i]);
        }
         //
        return maxConsonant+maxVowel;
    }
}
