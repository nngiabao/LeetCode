package String;

public class ThousandSeparator_1556 {
    public static void main(String[] args) {
        System.out.println(thousandSeparator(1234));
    }

    public static String thousandSeparator(int n) {
        if(n < 1000) return String.valueOf(n);
        String res = String.valueOf(n);
        StringBuilder sb = new StringBuilder();
        int count = 0;
        //build String
        for(int i = res.length()-1; i > -1; i--){
            if(count == 3){
                sb.append(".");
                count = 0;
            }
            sb.append(res.charAt(i));
            count++;
        }
        return sb.reverse().toString();
    }
}
