package BST;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class CheckDoubleExists_1346 {
    public static void main(String[] args) {
        int[] arr = {0,-2,2};
        System.out.println(new CheckDoubleExists_1346().checkIfExist2(arr));
    }
    //SOlution 1: TreeSet or Set
    public boolean checkIfExist(int[] arr) {
        TreeSet<Integer> set = new TreeSet<Integer>();
        //
        for (int i = 0; i < arr.length; i++) {
            if (set.contains((arr[i] / 2 + arr[i] & 1) == 0) || set.contains(arr[i] * 2)) return true;
            set.add(arr[i]);
        }
        return false;
    }

    //Solution 2:Using Hash set
    public boolean checkIfExist2(int[] arr) {
        //
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i : arr){
            if(set.contains(i*2) || (i%2==0 && set.contains(i/2))){
                 return true;
            }
            set.add(i);
        }
        return false;
    }
}
