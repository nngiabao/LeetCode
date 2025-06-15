package Greedy;

public class MaxDiff_1432 {
    public int maxDiff(int num) {
        String s = String.valueOf(num);
        //find max
        char maxDiff = ' ';
        //
        int len = s.length();
        //
        for(int i=0; i<len; i++){
            if(s.charAt(i) != '9'){
                maxDiff = s.charAt(i);
                break;
            }
        }
        String s_max = (maxDiff==' ') ? s : s.replace(maxDiff,'9');
        int max = Integer.parseInt(s_max);
        //
        char minDiff = ' ';
        boolean isFirstDigit = true;
        int i=0;
        while(i<len){
            if(s.charAt(i) != '0' && s.charAt(i) != '1' ){
                minDiff = s.charAt(i);
                break;
            }
            i++;
        }
        //check if encounter is first digit => cant be 0
        //otherwise => 0
        char charReplace = (i ==0) ? '1' : '0';
        String s_min = (minDiff==' ') ? s : s.replace(minDiff,charReplace);
        int min = Integer.parseInt(s_min);
        //
        return max-min;
    }
}
