package String;

public class MaxValue_2496 {
    public int maximumValue(String[] strs) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < strs.length; i++) {
            String s = strs[i];
            int sum = 0;
            boolean isDigit = true;
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if (Character.isDigit(s.charAt(j))) {
                    sum = sum * 10 + (c - '0');
                } else {
                    isDigit = false;
                    break;
                }
            }
            max = (isDigit) ? Math.max(max, sum) : Math.max(max, s.length()); ;
        }
        return max;
    }
}
