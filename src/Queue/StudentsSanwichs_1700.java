package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class StudentsSanwichs_1700 {
    public int countStudents(int[] students, int[] sandwiches) {
        //
        int i = 0;
        Queue<Integer> q = new LinkedList<Integer>();
        //put in a queue
        for (int num : students) {
            q.add(num);
        }
        //
        while (i < sandwiches.length) {
            boolean flag = true;
            int size = q.size();
            for (int j = 0; j < size; j++) {
                int student = q.poll();
                if (students[i] == sandwiches[i]) {
                    q.add(i);
                    i++;
                    flag = false;
                    break;
                } else {
                    q.add(student);
                }
            }
            if(flag) return q.size();
        }
        //
        return 0;
    }
    //Solution 2:Better

}
