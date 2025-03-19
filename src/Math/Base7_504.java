package Math;

public class Base7_504 {
    public static void main(String[] args) {
        System.out.println(convertToBase7(-1));
    }
    public static String convertToBase7(int num) {
        if (num == 0) return "0";
        StringBuilder res = new StringBuilder();
        boolean flag=true;
        if(num > 0 ) flag = false;
        num = Math.abs(num);
        while (num > 0) {
            res.append(num % 7);
            num /= 7;
        }
        if (flag) res.append("-") ;
        return res.reverse().toString();
    }
}
