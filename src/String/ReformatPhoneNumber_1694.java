package String;

public class ReformatPhoneNumber_1694 {
    public String reformatNumber(String number) {
        StringBuilder sb = new StringBuilder();
        int index = 0;
        for(char c : number.toCharArray()) {
            if (Character.isDigit(c)) {
                sb.append(c);
            }
        }
        //how many dash
        int len = sb.length();
        int dash = len/4;
        StringBuilder res = new StringBuilder();
        for(int i=0;i<len;i++) {
            char c = sb.charAt(i);
            if(i%3==0 && dash >0){
                res.append("-");
            }else{
                res.append(c);
            }
        }
        return res.toString();
    }
}
