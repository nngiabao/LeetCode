package Greedy;

public class MinCostMove_1217 {
    //
    public int minCostToMoveChips(int[] position) {
        //find total moves of even and odd numbers
        int even_moves = 0;
        int odd_moves = 0;
        for (int i : position) {
            if ((i & 1) == 1) even_moves++;
            else odd_moves++;
        }
        return Math.min(even_moves, odd_moves);
    }
}
