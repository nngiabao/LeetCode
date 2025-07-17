package Two_pointer;

public class ReverseWordsInString_151 {
    //Solution 1:Use the regex
    public String reverseWords(String s) {
        String regex = "\\s";
        String[] split = s.split(regex);
        StringBuilder sb = new StringBuilder();
        for (int i = split.length - 1; i >= 0; i--) {
            sb.append(split[i]).append(' ');
        }
        return sb.toString().trim();
    }


    //Solution 2:Using 2 pointers and swap in place
    public String reverseWords2(String s) {
        int left = s.length() - 1, right = s.length();
        StringBuilder sb = new StringBuilder();

        while (left >= 0) {
            if (s.charAt(left) == ' ') {
                left--;
            } else {
                right = left + 1;
                while (left >= 0 && s.charAt(left) != ' ') {// to avoid many space bar like example 3
                    left--;
                }
                sb.append(s.substring(left + 1, right)).append(' ');
            }
        }

        // remove the trailing space added after the last word
        if (sb.length() > 0) sb.setLength(sb.length() - 1);

        return sb.toString();
    }
}
