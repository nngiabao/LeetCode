package String;

public class FindFirstIndex_28 {
    public static void main(String[] args) {
        System.out.println(strStr("mississippi","issip"));
    }

    public static int strStr(String haystack, String needle){
        return haystack.indexOf(needle);
    }
}
