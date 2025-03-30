package String;

public class ToLowerCase_709 {
    public String toLowerCase(String s) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c-'a'< 0 ) sb.append((char) c+32);
            else sb.append(c);
        }
        return sb.toString();
    }
}
