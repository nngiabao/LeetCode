package BST;

import java.util.*;

public class MyCalendar1_704 {
    //using arraylsit
    List<int[]> list;
    public MyCalendar1_704() {
        list = new ArrayList<>();
    }

    public boolean book(int startTime, int endTime) {
        if(list.size() == 0) list.add(new int[]{startTime, endTime});
        else{
            for(int[] book : list){
                int start = book[0], end = book[1];
                if(Math.max(start,startTime) < Math.min(end,endTime)) return false;
            }
            list.add(new int[]{startTime, endTime});
        }
        return true;
    }
}
