package Greedy;

public class MinNumPuhses_3014 {
    public int minimumPushes(String word) {
        //
        int len = word.length();
        //
        if(len < 9) return len;
        int count = 0;
        //
        for(int i = 0; i < len; i++){
            count+= i/8+1;
        }
        //
        return count;
    }
}
