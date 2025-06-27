package String;

public class CheckIfWordOccursPrefix_1455 {
    //Solution 1:Using built-in method
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");
        int i=1;
        for(String word : words){
            if(word.startsWith(searchWord)) return i;
            i++;
        }
        return -1;
    }

}
