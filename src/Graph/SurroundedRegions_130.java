package Graph;

import java.util.LinkedList;
import java.util.Queue;

//flood-field algo
public class SurroundedRegions_130 {
    public void solve(char[][] board) {

        //do again
        //1st column
        //last column
        //step 2:flipp all of marked


    }
    //method BFS to mark
    //Solution 2:Best
    public void solve2(char[][] board) {
        if (board == null || board.length == 0) return;

        int m = board.length;
        int n = board[0].length;

        Queue<int[]> queue = new LinkedList<>();

        // Step 1: Add all border 'O's to the queue
        for (int i = 0; i < m; i++) {
            if (board[i][0] == 'O') queue.offer(new int[]{i, 0});
            if (board[i][n - 1] == 'O') queue.offer(new int[]{i, n - 1});
        }
        for (int j = 0; j < n; j++) {
            if (board[0][j] == 'O') queue.offer(new int[]{0, j});
            if (board[m - 1][j] == 'O') queue.offer(new int[]{m - 1, j});
        }

        // Step 2: BFS to mark all connected 'O's from border
        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int x = cell[0], y = cell[1];

            if (x < 0 || y < 0 || x >= m || y >= n || board[x][y] != 'O') continue;

            board[x][y] = 'E'; // Mark as escaped

            // Add 4-directionally connected neighbors
            queue.offer(new int[]{x + 1, y});
            queue.offer(new int[]{x - 1, y});
            queue.offer(new int[]{x, y + 1});
            queue.offer(new int[]{x, y - 1});
        }

        // Step 3: Flip surrounded regions and restore escaped ones
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X'; // Surrounded, flip
                } else if (board[i][j] == 'E') {
                    board[i][j] = 'O'; // Restore
                }
            }
        }
    }
}
