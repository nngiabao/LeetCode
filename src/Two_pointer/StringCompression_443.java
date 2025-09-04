package Two_pointer;

public class StringCompression_443 {
    public int compress(char[] chars) {
        int n = chars.length;
        int index = 0;   // position to index compressed characters
        int i = 0;       // read pointer

        while (i < n) {
            char current = chars[i];
            int count = 0;

            // Count consecutive group
            while (i < n && chars[i] == current) {
                i++;
                count++;
            }

            // Write character
            chars[index++] = current;

            // Write count if > 1
            if (count > 1) {
                String num = String.valueOf(count);
                for (char c : num.toCharArray()) {
                    chars[index++] = c;
                }
            }
        }

        return index; // new length
    }
}
