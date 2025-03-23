package Math;

public class AddDigits_258 {
    public static void main(String[] args) {
        addDigits(38);
    }

    public static int addDigits(int num) {
        if(num<10) return num;
        int sum = 0,i=0;
        StringBuilder sb = new StringBuilder(String.valueOf(num));
        while(sb.length() > 1){
            while(i < sb.length()){
                sum += sb.charAt(i)-'0';
                i++;
            }
            sb.delete(0,sb.length()).append(sum);
            i=0;sum=0;
        }
        return Integer.parseInt(sb.toString());
    }
}
