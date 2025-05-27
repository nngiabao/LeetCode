package Greedy;

public class Max69Num_1323 {
    public int maximum69Number (int num) {
        StringBuilder sb = new StringBuilder(String.valueOf(num));
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='6'){
                sb.setCharAt(i,'9');
                return Integer.parseInt(sb.toString());
            }
        }
        return num;
    }
}
