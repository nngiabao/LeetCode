package String;

public class ReformatString_1417 {
    public String reformat(String s) {
        //build digit and alpha
        StringBuilder letter = new StringBuilder();
        StringBuilder digit = new StringBuilder();
        //
        for(int i=0;i<s.length();i++){
            //
            char c = s.charAt(i);
            //
            if(Character.isLetter(c)){
                letter.append(c);
            }else{
                digit.append(c);
            }
        }
        int i=0,j=0;
        //build
        int index=0;
        StringBuilder sb = new StringBuilder();
        while(i< letter.length() && j<digit.length()){
            if((index&1)==0) sb.append(letter.charAt(j));
            else sb.append(digit.charAt(i));
            i++;
            j++;
            index++;
        }
        //
        return sb.toString();
    }
}
