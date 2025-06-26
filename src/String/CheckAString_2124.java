package String;

public class CheckAString_2124 {
    public static void main(String[] args) {
        CheckAString_2124 a = new CheckAString_2124();
        System.out.println(a.checkString("ba"));
    }
    //Solution 1: brute-force
    //using like a gap
    public boolean checkString(String s) {
        //edge case
        if (s.length() == 1) return true;
        //flag to check if chage
        int max = 0;
        for (int i = 1; i < s.length(); i++) {
            int val = s.charAt(i) - 'a';
            if (val >= max) {
                max = val;
            } else {
                return false;
            }
        }
        return true;
    }
    //
}
