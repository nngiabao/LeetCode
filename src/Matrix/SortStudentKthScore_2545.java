package Matrix;


import java.util.*;

public class SortStudentKthScore_2545 {
    public static void main(String[] args) {
        SortStudentKthScore_2545 a = new SortStudentKthScore_2545();
        int[][] temp = {{10, 6, 9, 1}, {7, 5, 11, 2}, {
                4, 8, 3, 15
        }};
        a.sortTheStudents(temp, 2);
    }

    //SOlution 1:Using hashmap
    public int[][] sortTheStudents(int[][] score, int k) {
        //find the column and sort
        int m = score.length;
        int n = score[0].length;
        //selection sort
        Map<Integer, int[]> map = new TreeMap<>();
        for (int i = 0; i < m; i++) {
            int[] list = new int[n];
            for (int j = 0; j < n; j++) {
                if (j != k) {
                    list[j] = score[i][j];
                }
            }
            map.put(score[i][k], list);
        }
        //put back
        int index = m - 1;
        for (Integer key : map.keySet()) {
            int[] list = map.get(key);
            for (int j = 0; j < n; j++) {
                if (j != k) {
                    score[index][j] = list[j];
                } else score[index][j] = key;
            }
            index--;
        }
        return score;
    }

    //Solution 1.1:Similiar to solution 1 but cleaner
    public int[][] sortTheStudents2(int[][] score, int k) {
        Map<Integer, int[]> map = new TreeMap<>();
        for (int[] row : score) {
            map.put(row[k], row);
        }
        //because treemap is increasing order so we put from the back
        int index = score.length - 1;
        for (int[] row : map.values()) {
            score[index--] = row;
        }
        return score;
    }

    //Solution 2:Using lambda to sort by column k
    public int[][] sortTheStudents3(int[][] score, int k) {
        //this is the way to order matrix
        Arrays.sort(score, (a, b) -> Integer.compare(b[k], a[k]));
        return score;
    }
}
