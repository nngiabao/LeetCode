package Array;

public class StudentsDoneHW_1450 {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count=0;
        for (int i = 0; i < startTime.length; i++) {
            if(endTime[i] >= queryTime && startTime[i] <= queryTime) count++;
        }
        return count;
    }
}
