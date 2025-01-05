public class RevString_344 {

    public static void main(String[] args) {
        char[]s = {'h','e','l','l','o'};
        reverseString(s);
        System.out.println(s);
    }

    public static void reverseString(char[] s) {
        int n = s.length;
        int l = 0, r = s.length-1;
        while(l<r) {
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;r--;
        }
    }
}
