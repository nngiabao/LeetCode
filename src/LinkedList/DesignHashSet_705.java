package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;


public class DesignHashSet_705 {

    public static void main(String[] args) {
        DesignHashSet_705 a = new DesignHashSet_705();
        a.add(1);      // set = [1]
        a.add(2);      // set = [1, 2]
        a.contains(1); // return True
        a.contains(3); // return False, (not found)
        a.add(2);      // set = [1, 2]
        a.contains(2); // return True
        a.remove(2);   // set = [1]
        System.out.println(a.contains(2)); // return false;

    }
    LinkedList<Integer> list ;

    public DesignHashSet_705() {
         list = new LinkedList<Integer>();
    }

    public void add(int key) {
        if(!this.contains(key)) list.add(key);
    }

    public void remove(int key) {
        list.remove(Integer.valueOf(key));
    }

    public boolean contains(int key) {
        return list.contains(key);
    }
}

/*
other way to implement hashset ( much faster )
class MyHashSet {
    private int primarySize;
    private int secondarySize;
    private boolean[][] buckets;

    public MyHashSet() {
        primarySize = 1001;
        secondarySize = 1000;
        buckets = new boolean[primarySize][];
    }

    public void add(int key) {
        int p = key/primarySize;
        int s = key%secondarySize;
        if (buckets[p]==null)
            buckets[p]=new boolean[secondarySize];
        buckets[p][s]=true;
    }

    public void remove(int key) {
        int p = key/primarySize;
        int s = key%secondarySize;
        if (buckets[p]==null)
            return;
        buckets[p][s]=false;
    }

    public boolean contains(int key) {
        int p = key/primarySize;
        int s = key%secondarySize;
        if (buckets[p]==null)
            return false;
        return buckets[p][s];
    }
}
 */