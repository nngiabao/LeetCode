package Matrix;

import java.lang.reflect.Array;
import java.util.*;

public class IntersectionOfMultiArrays_2248 {
    //Solution 1:Using built-in method
    public List<Integer> intersection(int[][] nums) {
        int len = nums.length;
        List<Integer> res = new ArrayList<>();
        for(int num : nums[0]){
            //put into res if it = zero
            res.add(num);
        }
        //
        for(int i=1;i<len;i++){
            //put every array into array list
            List<Integer> temp = new ArrayList<>();
            for(int num : nums[i]){
                temp.add(num);
            }
            //
            res.retainAll(temp);
            if(res.size()==0) return null;
        }
        Collections.sort(res);
        return res;
    }

    //Solution 2: Using array
    public List<Integer> intersection2(int[][] nums) {
        int len = nums.length;
        List<Integer> res = new ArrayList<>();
        //
        Arrays.sort(nums[0]);
        int i=0;
        boolean isContain=false;
        while(i < nums[0].length){
            isContain=false;
            for(int j=1;j<nums.length;j++){
                Arrays.sort(nums[j]);
                for(int k=0;k<nums[j].length;k++){
                    if(nums[0][i] == nums[j][k]){
                        isContain=true;
                        break;
                    }
                    else if(nums[0][i] < nums[j][k]) break;
                }
                if(!isContain) break;
            }
            if(isContain) res.add(nums[0][i]);
            i++;
        }
        return res;
    }
}
