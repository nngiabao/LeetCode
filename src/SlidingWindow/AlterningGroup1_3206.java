package SlidingWindow;

import java.util.Arrays;

public class AlterningGroup1_3206 {
    public static void main(String[] args) {
        AlterningGroup1_3206 a  = new AlterningGroup1_3206();
        int[] c = {0, 1, 0, 0, 1};
        a.numberOfAlternatingGroups(c);

    }
    public int numberOfAlternatingGroups(int[] colors) {
        //
        int n = colors.length;
        int[] temp = Arrays.copyOf(colors, n + 2);
        //
        temp[n] = colors[0];
        temp[n+1] = colors[1];
        //
        int count = 0;
        for (int i = 1; i<=n; i++) {
            if (temp[i] != temp[i - 1] && temp[i] != temp[i + 1]) count++;
        }
        return count;
    }
}
