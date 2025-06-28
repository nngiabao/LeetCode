package String;

public class ReplaceAllDigits_1844 {
    public static void main(String[] args) {
        String s = "a1c1e1";
        System.out.println(new ReplaceAllDigits_1844().replaceDigits(s));
    }
    public String replaceDigits(String s) {
        //
        StringBuilder sb = new StringBuilder();
        char temp = 'a';
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            //even indices
            if((i&1) == 0) {
                sb.append(c);
                temp = c;
            }else{
                sb.append((char)(temp+c-'0'));
            }
        }
         //

        return sb.toString();
    }
}
