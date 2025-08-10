package Matrix;

import java.util.*;

public class CellsOddValue_1252 {
    //SOlution 1:Brute-force
    public int oddCells(int m, int n, int[][] indices) {
        //
        int count=0;
        int[][] res =  new int[m][n];
        int[] cage = new int[51];
        HashSet<Integer> row = new HashSet<>();
        HashSet<Integer> col = new HashSet<>();
        //put into cell,row
        for(Integer i : row) {

        }
        //inc col
        for(Integer i : row) {

        }
        //inc row
        for(Integer i : row) {
            for(int j=0;i<n;i++){

            }
        }
        //
        for(Integer i : col) {
            for(int j=0;i<n;i++){

            }
        }
        //count
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if((res[i][j]&1)==1) count++;
            }
        }
        return count;
    }
    //Solution 2:
}
