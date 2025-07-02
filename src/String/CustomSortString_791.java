package String;

public class CustomSortString_791 {
    public static void main(String[] args) {
        CustomSortString_791 a = new CustomSortString_791();
        a.customSortString("cba", "abcd");
    }
    //Solution 1:not optimized
    public String customSortString(String order, String s) {
        //build dictionary
        int[] dictinary = new int[26];
        //
        for(char c : s.toCharArray()){
            dictinary[c-'a']++;
        }
        //
        String result = "";
        for(char c : order.toCharArray()){
            for(int i=0;i<dictinary[c-'a'];i++){
                result += c;
            }
            dictinary[c-'a']=0;
        }
        //check the rest char
        for(int i=0;i<26;i++){
            for(int j=0;j<dictinary[i];j++){
                result+= (char)(i+'a');
            }
        }
        return result;
    }
    //Solution 2:clean version
    public String customSortString2(String order, String s) {
        int[] dictinary = new int[26];
        // Count the frequency of each character in s
        for (char c : s.toCharArray()) {
            dictinary[c - 'a']++;
        }
        //
        StringBuilder result = new StringBuilder();
        // Append characters in the order defined by 'order'
        for (char c : order.toCharArray()) {
            while (dictinary[c - 'a'] > 0) {
                result.append(c);
                dictinary[c - 'a']--;
            }
        }
        // Append characters that were not in 'order'
        for (char c = 'a'; c <= 'z'; c++) {
            while (dictinary[c - 'a'] > 0) {
                result.append(c);
                dictinary[c - 'a']--;
            }
        }
        //
        return result.toString();
    }
}
