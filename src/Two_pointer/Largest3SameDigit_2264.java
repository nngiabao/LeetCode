package Two_pointer;

public class Largest3SameDigit_2264 {
    //Solution 1:sliding window
    public String largestGoodInteger(String num) {
        //
        int len = num.length();
        StringBuilder res = new StringBuilder();
        String max = "";
        for (int i = 3; i <= len; i++) {
            String s = num.substring(i - 3, i);
            if (s.charAt(0) == s.charAt(1) && s.charAt(1)  == s.charAt(2)) {
                if(max == "") max = s;
                else if (Integer.parseInt(s) > Integer.parseInt(max)) max = s;
            }
        }
        //
        return max;
    }
    //Solution 2:Store value - best one
    public String largestGoodInteger2(String num) {
        String[] numbers = {"999", "888", "777", "666", "555", "444", "333", "222", "111", "000"};
        for (String s : numbers) {
            if (num.contains(s)) {
                return s;
            }
        }
        return "";
    }
}
