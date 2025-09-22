package Two_pointer;

public class CheckIfStringPrefix_1961 {
    public boolean isPrefixString(String s, String[] words) {
        int i = 0;
        StringBuilder sb = new StringBuilder();
        int sLen = s.length();
        for(String w : words) {
            if(s.equals(sb.toString())) return true;
            int lenWord = w.length();
            if(i+lenWord <= sLen && w.equals(s.substring(i, i+lenWord))){
                sb.append(w);
                i+=lenWord;
            }else return false;
        }
        return (s.equals(sb.toString())) ? true : false;
    }
}
