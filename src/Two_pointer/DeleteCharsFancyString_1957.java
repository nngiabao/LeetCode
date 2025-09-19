package Two_pointer;

public class DeleteCharsFancyString_1957 {
    //Solution 1:Using 2 pointers
    public String makeFancyString(String s) {
        //
        int len = s.length();
        if (len < 3) return s;
        int start = 0;
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            char c_start = s.charAt(start);
            char c_i = s.charAt(i);
            //if != => update start and count
            if (count == 2 && c_start == c_i) continue;
            if (c_start != c_i) {
                start = i;
                count = 1;
            } else count++;
            sb.append(c_i);
        }
        return sb.toString();
    }

    //Solution 2:
    public String makeFancyString2(String s) {
        char[] chars = s.toCharArray();
        char last = chars[0];
        int count = 1;
        int pos = 1;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] != last) {
                last = chars[i];
                count = 0;
            }
            if (++count > 2) continue;
            chars[pos++] = chars[i];
        }
        return new String(chars, 0, pos);
    }
}
