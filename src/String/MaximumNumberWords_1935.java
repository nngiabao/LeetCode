package String;

public class MaximumNumberWords_1935 {
    public static void main(String[] args) {
        System.out.println(canBeTypedWords("hello world","ad"));
    }
    //Solution:
    public static int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
        int count = 0;
        //put brokenLetters into char array
        char [] chars = brokenLetters.toCharArray();

        for(String word : words){
            boolean flag=true;
            for(char ch : chars){
                if(word.indexOf(ch) > -1){
                    flag=false;
                    break;
                }
            }
            if(flag) count++;
        }
        return count;
    }
}
