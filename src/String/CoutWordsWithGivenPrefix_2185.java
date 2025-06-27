package String;

public class CoutWordsWithGivenPrefix_2185 {
    public int countWords(String[] words, String pref) {
        int count=0;
        for(String word : words){
            if(word.startsWith(pref)) count++;
        }
        return count;
    }
}
