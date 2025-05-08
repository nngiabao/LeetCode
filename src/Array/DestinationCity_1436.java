package Array;
import java.util.*;
public class DestinationCity_1436 {
    //Solution 1:Do again
    public String destCity(List<List<String>> paths) {
        List<String> res = new ArrayList<>();
        //add
        res.add(paths.get(0).get(0));
        res.add(paths.get(0).get(1));
       for(int i=1;i<paths.size();i++) {
            if(res.contains(paths.get(i).get(0))) {
                String temp = paths.get(i).get(0);
                int index = res.indexOf(temp);
                res.add(index+1,paths.get(i).get(1));
            }else if(res.contains(paths.get(i).get(1))){
                String temp = paths.get(i).get(1);
                int index = res.indexOf(temp);
                res.add(index,paths.get(i).get(0));
            }
       }
        return res.getLast();
    }
    //Solution 2:
    //because destination will never be a starting city
    //=> find starting city
    //=> return the citi neva start
    public String destCity2(List<List<String>> paths) {
        Set<String> res = new HashSet<>();
        for(List<String> path : paths) {
            res.add(path.get(0));
        }
        //check the city neva be a starting
        for(List<String> path : paths) {
            String des = path.get(1);
            if(!res.contains(path.get(0))) return des;
        }
        return " ";
    }
}
