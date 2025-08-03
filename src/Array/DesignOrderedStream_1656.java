package Array;

import java.util.*;

//
public class DesignOrderedStream_1656 {
    String[] array;
    int pointer = 1;

    public DesignOrderedStream_1656(int n) {
        array = new String[n+2];
    }

    //
    public List<String> insert(int idKey, String value) {
        array[idKey] = value;
        List<String> temp = new ArrayList<>();
        while (array[pointer] != null) {
            temp.add(array[pointer]);
            pointer++;
        }
        return temp;
    }
}
