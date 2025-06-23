package String;

public class DivideStringIntoGroupSizeK_2138 {
    public String[] divideString(String s, int k, char fill) {
        int len = s.length();
        int groups = (len + k - 1) / k;
        String[] result = new String[groups];

        for (int i = 0; i < groups; i++) {
            int start = i * k;
            int end = Math.min(start + k, len);
            String group = s.substring(start, end);
            // fill if last group is short
            if (group.length() < k) {
                StringBuilder sb = new StringBuilder(group);
                while (sb.length() < k) {
                    sb.append(fill);
                }
                group = sb.toString();
            }
            result[i] = group;
        }

        return result;
    }
}
