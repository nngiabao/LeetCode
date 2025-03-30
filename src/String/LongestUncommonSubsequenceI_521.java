package String;

public class LongestUncommonSubsequenceI_521 {
    public static void main(String[] args) {
        String a = "aba";
        String b = "cdc";
        System.out.println(findLUSlength(a,b));
    }

    public static int findLUSlength(String a, String b) {
        if(a.equals(b)) return -1;
        return (a.length() > b.length() ? a.length() : b.length());
    }
}
