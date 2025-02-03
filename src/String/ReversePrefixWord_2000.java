package String;

public class ReversePrefixWord_2000 {
    public static void main(String[] args) {
        System.out.println(reversePrefix("abcdefd",'d'));;
    }


    public static String reversePrefix(String word, char ch) {
        //
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while(i<word.length()) {
            char c = word.charAt(i);
            if(c==ch){
                sb.append(c).reverse();
                break;
            }
            sb.append(c);
            i++;
        }
        if(i<word.length()) i++;
        return sb.append(word.substring(i,word.length())).toString();
    }
}
