package String;

public class LengthLastWord_58 {
    public int lengthOfLastWord(String s) {
        String[]temp = s.split(" ");
        return temp[temp.length-1].length();
    }
}
