package Two_pointer;

public class CountAndSay_38 {
    public String countAndSay(int n) {
        if (n <= 0) return "";

        String term = "1";

        for (int i = 2; i <= n; i++) {
            StringBuilder sb = new StringBuilder();
            int count = 1;
            char prev = term.charAt(0);

            for (int j = 1; j < term.length(); j++) {
                char curr = term.charAt(j);
                if (curr == prev) {
                    count++;
                } else {
                    sb.append(count).append(prev);
                    count = 1;
                    prev = curr;
                }
            }

            // Append the last group
            sb.append(count).append(prev);
            term = sb.toString();
        }

        return term;
    }
}
