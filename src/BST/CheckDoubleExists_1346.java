package BST;

import java.util.TreeSet;

public class CheckDoubleExists_1346 {
    //SOlution 1: TreeSet or Set
    public boolean checkIfExist(int[] arr) {
        TreeSet<Integer> set = new TreeSet<Integer>();
        //
        for(int i=0;i<arr.length;i++){
            if(set.contains((arr[i]/2 + arr[i]&1)==0) || set.contains(arr[i]*2)) return true;
            set.add(arr[i]);
        }
        return false;
    }
}
