package Greedy;

public class MinDiffByRemapping_2566 {
    public static void main(String[] args) {
        MinDiffByRemapping_2566 m = new MinDiffByRemapping_2566();
        System.out.println(m.minMaxDifference(90));
    }

    public int minMaxDifference(int num) {
        String s = String.valueOf(num);
        //string is mutable
        //find the biggest num
        char digitMaxReplace = ' ';
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c != '9'){
                digitMaxReplace = c;
                break;
            }
        }
        //
        String s_max = (digitMaxReplace == ' ') ? s : s.replace(digitMaxReplace,'9');
        int max = Integer.parseInt(s_max);
        //this one has to be different from 1 only
        char digitMinReplace = ' ';
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if( c != '0'){
                digitMinReplace = c;
                break;
            }
        }

        String s_min = (digitMinReplace == ' ') ? s : s.replace(digitMinReplace,'0');
        int min = Integer.parseInt(s_min);
        return max-min;
    }
}
