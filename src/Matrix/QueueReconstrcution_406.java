package Matrix;

import java.util.*;
import java.util.Comparator;

public class QueueReconstrcution_406 {
    public int[][] reconstructQueue(int[][] people) {
        //arrange by height decreasing
        //then arrange by k index
        //
        Arrays.sort(people, (a,b) -> b[0] == a[0] ? a[1]-b[1] : b[0]-a[0]);
        //put into back the List
        List<int[]> temp = new ArrayList<>();;
        for(int i=0;i<people.length;i++){
            //build by index
            temp.add(people[i][1], people[i]);
        }

        return temp.toArray(new int[people.length][2]);
    }
}
