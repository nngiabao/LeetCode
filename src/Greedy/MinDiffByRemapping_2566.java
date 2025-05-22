package Greedy;

public class MinDiffByRemapping_2566 {
    public static void main(String[] args) {

        MinDiffByRemapping_2566 m = new MinDiffByRemapping_2566();
        System.out.println(m.minMaxDifference(90));
    }
    public int minMaxDifference(int num) {
        //find the first digit
        String s = String.valueOf(num);
        char first = s.charAt(0);
        StringBuilder max = new StringBuilder(s);
        StringBuilder min = new StringBuilder(s);
        int len = max.length();
        //find the biggest num
         for(int i = 0; i < len; i++) {
             if(max.charAt(i) == first) max.setCharAt(i, '9');
         }
         int i_max = Integer.parseInt(max.toString());
        //find the smallest num
        for(int i = 0; i < len; i++) {
            if(min.charAt(i) == first) min.setCharAt(i, '0');
        }
        int i_min = Integer.parseInt(min.toString());
        return i_max - i_min;
    }
}
