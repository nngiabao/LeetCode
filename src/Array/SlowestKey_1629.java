package Array;

import java.util.PriorityQueue;

public class SlowestKey_1629 {
    //Solution 1
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        //
        int max = releaseTimes[0];
        int duration;
        char res = keysPressed.charAt(0);
        for (int i = 0; i < releaseTimes.length; i++) {
            duration = (i==0) ? releaseTimes[0] : releaseTimes[i] - releaseTimes[i - 1];
            if(max < duration){
                max = duration;
                res = keysPressed.charAt(i);
            }else if(max == duration){
                char pressed = keysPressed.charAt(i);
                if(pressed > res) res = pressed;
            }
        }
        return res;
    }

    //Solution 2:
}
