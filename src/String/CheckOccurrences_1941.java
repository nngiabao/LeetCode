package String;

public class CheckOccurrences_1941 {
    public boolean areOccurrencesEqual(String s) {
        //create array for 26 letters
        int [] letters = new int[26];
        for(int i = 0; i < s.length(); i++) {
            letters[s.charAt(i) - 'a']++;
        }
        //check good string or not
        int check = 0;
        for(int i = 0; i < 26; i++) {
            if(letters[i] == 0) continue;
            else if(check != 0 ){
                if(check != letters[i]) return false;
            }
            check = letters[i];
        }
        return true;
    }
}
