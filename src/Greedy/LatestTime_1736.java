package Greedy;

public class LatestTime_1736 {
    public String maximumTime(String time) {
        //
        String[] times = time.split(":");
        StringBuilder sb = new StringBuilder();
        //hour
        if(times[0].charAt(0)=='?'){
            sb.append('2');
        }else sb.append(times[0].charAt(0));
        if(times[0].charAt(1)=='?'){
            sb.append('3');
        }else sb.append(times[0].charAt(1));
        //minute
        if(times[1].charAt(0)=='?'){
            sb.append('5');
        }else sb.append(times[1].charAt(0));
        if(times[1].charAt(1)=='?'){
            sb.append('9');
        }else sb.append(times[1].charAt(1));
        ///
        return sb.toString();
    }
}
