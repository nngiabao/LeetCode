package Array;

import java.util.Arrays;

public class DesignHashMap_706 {
    int[] map;

    public DesignHashMap_706() {
        map = new int[1_000_001];
        Arrays.fill(map, -1); // use -1 to represent "not present"
    }

    public void put(int key, int value) {
        map[key] = value;
    }

    public int get(int key) {
        return map[key];
    }

    public void remove(int key) {
        map[key] = -1;
    }

    /*Solution 2: using custom class<key,value> to build
    class Node {
    int key;
    int value;
    Node next;

    public Node(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

class MyHashMap {
    Node arr[] = new Node[10000];

    public MyHashMap() {

    }

    public int getHashKey(int key) {
        return key % 10000;
    }

    public void put(int key, int value) {
        int hashKey = getHashKey(key);
        Node curr = arr[hashKey];
        if (curr == null) {
            arr[hashKey] = new Node(key, value);
            return;
        }

        if (curr.key == key) {
            curr.value = value;
            return;
        }

        while (curr.next != null) {
            if (curr.next.key == key) {
                curr.next.value = value;
                return;
            }
            curr = curr.next;
        }
        curr.next = new Node(key, value);
    }

    public int get(int key) {
        Node curr = arr[getHashKey(key)];
        while (curr != null) {
            if (curr.key == key) {
                return curr.value;
            }
            curr = curr.next;
        }
        return -1;
    }

    public void remove(int key) {
        int hashKey = getHashKey(key);
        Node curr = arr[hashKey];
        if (curr == null)
            return;

        if (curr.key == key) {
            arr[hashKey] = curr.next;
            return;
        }
        while (curr.next != null) {
            if (curr.next.key == key) {
                curr.next = curr.next.next;
                return;
            }
            curr = curr.next;
        }
    }
}
    * */
}



