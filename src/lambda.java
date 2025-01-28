import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class lambda {
        public static void main(String[] args) {
            Set<Integer> set = new HashSet<Integer>();
            set.add(1);
            set.add(2);
            set.add(3);
            Set<Integer> set2 = new HashSet<Integer>();
            set2.add(1);
            set2.add(2);
            set2.add(4);

            Set<Integer> temp = new HashSet<>(set);
            //set.removeAll(temp);
            temp.removeAll(set2);
            System.out.println(temp);
            System.out.println(set);
            System.out.println(set2);

        }
    }


