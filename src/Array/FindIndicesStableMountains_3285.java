package Array;

import java.util.ArrayList;
import java.util.List;

public class FindIndicesStableMountains_3285 {
    public List<Integer> stableMountains(int[] height, int threshold) {
        List<Integer> res = new ArrayList<Integer>();
        for(int i = 0; i < height.length-1; i++){
            if(height[i] > threshold) res.add(i+1);
        }
        return res;
    }
}
