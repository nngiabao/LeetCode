package String;

public class VerifyingAlienDictionary_953 {
    public static void main(String[] args) {
        String[] words = {"apple", "app"};
        String order = "abcdefghijklmnopqrstuvwxyz";
        VerifyingAlienDictionary_953 a = new VerifyingAlienDictionary_953();
        System.out.println(a.isAlienSorted(words, order));
    }
    public boolean isAlienSorted(String[] words, String order) {
        for (int m = 1; m < words.length; m++) {
            //check every letters in both string
            int i=0,j=0;
            int i_len = words[m].length();
            int j_len = words[m-1].length();
            while(i < i_len && j < j_len) {
                int index_word_1 = order.indexOf(words[m].charAt(i++));
                int index_word_2 = order.indexOf(words[m-1].charAt(j++));
                if(index_word_1 < index_word_2) return false;
                else if(index_word_1 > index_word_2) break;
            }
            //check if there still exsit left
            if (i_len < j_len && i == i_len) return false;
        }
        return true;
    }


}
