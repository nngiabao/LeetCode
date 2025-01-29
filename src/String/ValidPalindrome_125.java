package String;

public class ValidPalindrome_125 {
    public static void main(String[] args) {
       //int i = 0, j = s.length() - 1;
        String s = "A man, a plan, a canal: Panama";
        String reg = "[^a-zA-Z]";
        String[] b = s.split(reg);

        System.out.println(String.join("",b));
    }
    public boolean isPalindrome(String s) {
        String reg = "[^a-zA-Z0-9]";//to remove all non-alphanumric
        String[] split = s.split(reg);
        String temp = String.join("", split).toLowerCase();
        int i = 0, j = temp.length() - 1;
        while (i < j) {
            if (temp.charAt(i) != temp.charAt(j)) return false;
            i++;
            j++;
        }
        return true;
    }
}
