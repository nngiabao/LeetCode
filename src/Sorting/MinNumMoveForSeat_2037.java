package Sorting;

import java.util.Arrays;

public class MinNumMoveForSeat_2037 {
    //Solution 1:
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int sum=0;
        for(int i=0;i<seats.length;i++){
            if(seats[i] != students[i]) sum+=Math.abs(seats[i] - students[i]);
        }
        return sum;
    }
    //Solution 2:
    public int minMovesToSeat2(int[] seats, int[] students) {
        int sum=0;
        for(int i=0;i<seats.length;i++){
            sum+=seats[i] - students[i];
        }
        return Math.abs(sum);
    }

}
