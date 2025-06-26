package String;

import java.util.HashSet;
import java.util.*;

public class PathCrossing_1496 {

    public boolean isPathCrossing(String path) {
        //
        //create set to save passing point
        //
        Set<String> set = new HashSet<String>();
        set.add("0,0");
        int vertical=0,horizontal=0;
        //
        int i=0;
        while(i<path.length()){
            if(path.charAt(i)=='N'){
                horizontal++;
            }else if(path.charAt(i)=='S'){
                horizontal--;
            }else if(path.charAt(i)=='E'){
                vertical++;
            }else{
                vertical--;
            }
            String pos = horizontal +","+vertical;
            if(set.contains(pos)) return true;
            set.add(pos);
            i++;
        }
        return false;
    }
}
