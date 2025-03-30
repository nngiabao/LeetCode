package String;

public class ReverseWordsIII_557 {
    //Solution 1
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder res = new StringBuilder();
        for(String word : words){
            res.append(new StringBuilder(word).reverse()).append(" ");
        }
        return res.toString().trim();
    }

    //Solution 2:
    public String reverseWords2(String s) {
        char[] words = s.toCharArray();
        int start = 0;
        for(int i=0;i<words.length;i++){
            //check until see whitespace or last letter => 1 word
            if( i == words.length || words[i] == ' ' ){
                reverseWord(words,start,i-1);
                start = i+1;
            }
        }
        return words.toString();
    }

    //build the reverse function
    public void reverseWord(char[] words,int start,int end){
        char temp;
        while(start<end){
            temp = words[start];
            words[start++] = words[end];
            words[end--] = temp;
        }
    }
}
