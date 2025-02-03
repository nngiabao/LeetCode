package String;
public class FindIndex_28 {
    public static void main(String[] args) {
        System.out.println();
    }

    public static int strStr(String haystack, String needle) {
        int count = 0,i=0;
        while (count != needle.length() && i < haystack.length()) {
            if (haystack.charAt(i++) - needle.charAt(count) != 0) {
                count=0;
                continue;
            }else{
                count++;
            }
            //if(count == needle.length()) return i-needle.length();
        }
        return count == needle.length() ? i-needle.length()-1 : -1;
}
}
