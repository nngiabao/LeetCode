package Two_pointer;

public class MergeStrings_1768 {
    public String mergeAlternately(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        int i = 0, j = 0;
        StringBuilder sb = new StringBuilder();
        while (i < len1 && j < len2) {
            char c_1 = word1.charAt(i);
            char c_2 = word2.charAt(j);
            //
            sb.append(c_1);
            sb.append(c_2);
            i++;
            j++;
        }
        if (i < len1) sb.append(word1.substring(i, len1));
        else sb.append(word2.substring(j, len2));
        return sb.toString();
    }
}
