package Greedy;

import java.util.Arrays;

public class MaxUnitsInTruck_1710 {
    public static void main(String[] args) {

        int[][] b = {{1,3},{2, 2},{3,1}};
        MaxUnitsInTruck_1710 a = new MaxUnitsInTruck_1710();
        System.out.println(a.maximumUnits(b, 4));
    }
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        //sort by second column => sorting by units by decreasing order
        Arrays.sort( boxTypes, (a, b) -> (b[1] - a[1]));
        int total_units = 0;
        int i=0;
        while(truckSize > 0 && i<boxTypes.length ){
            int box_units = Math.min(truckSize, boxTypes[i][0]);
            total_units += boxTypes[i][1] * box_units;
            truckSize -= box_units;
            i++;
        }
        return total_units ;
    }
}
