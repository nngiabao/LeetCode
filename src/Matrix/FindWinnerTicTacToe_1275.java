package Matrix;

public class FindWinnerTicTacToe_1275 {
    //Solution 1:
    public String tictactoe(int[][] moves) {
        int n = moves.length;
        boolean[][] a_move = new boolean[3][3];
        boolean[][] b_move = new boolean[3][3];

        // Fill both A and B moves
        for (int i = 0; i < n; i++) {
            int r = moves[i][0], c = moves[i][1];
            if (i % 2 == 0)
                a_move[r][c] = true;
            else
                b_move[r][c] = true;
        }

        if (check(a_move)) return "A";
        if (check(b_move)) return "B";

        // Pending if not all cells filled
        return n < 9 ? "Pending" : "Draw";
    }

    boolean check(boolean[][] m) {
        // Check rows and cols
        for (int i = 0; i < 3; i++) {
            if (m[i][0] && m[i][1] && m[i][2]) return true;
            if (m[0][i] && m[1][i] && m[2][i]) return true;
        }

        // Diagonals
        if (m[0][0] && m[1][1] && m[2][2]) return true;
        if (m[0][2] && m[1][1] && m[2][0]) return true;

        return false;
    }
}
