package String;

public class DetectCapital_520 {
    public static void main(String[] args) {
        String s = "g";
        System.out.println(detectCapitalUse(s));

    }
    public static boolean detectCapitalUse(String word) {
        if(word.length() == 1) return true;
        //check 3 cases;
        //case 1:

        //case 2:
        //case 3:
        for(int i=1; i<word.length(); i++) {
            char c = word.charAt(i);
            //check first letter then see which case
            if(Character.isUpperCase(word.charAt(0))){
                //case 1: all letter upper case
                if(Character.isUpperCase(word.charAt(1))){
                    if(Character.isLowerCase(word.charAt(i))) return false;
                }else{
                    if(!Character.isLowerCase(word.charAt(i))) return false;
                }
            }else{
                if(!Character.isLowerCase(c)) return false;
            }
        }
        return true;
    }
}
