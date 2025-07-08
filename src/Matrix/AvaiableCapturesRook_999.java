package Matrix;

public class AvaiableCapturesRook_999 {
    public int numRookCaptures(char[][] board) {
        //step 1: find the pos of rook
        int n = board.length;
        int[] rook_pos = new int[n]; // pos of rook
        //
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'R') {
                    rook_pos[0] = i;
                    rook_pos[1] = j;
                }
            }
        }
        //step 2: find the closest chess meet
        //4 pointers for 4 ways
        int up = rook_pos[0] - 1;
        int down = rook_pos[0] + 1;
        int left = rook_pos[1]-1;
        int right = rook_pos[1]+1;
        int count = 0;
        //check
        while (up >= 0) {
            if (board[up][rook_pos[1]] != '.') {
                if (board[up][rook_pos[1]] == 'p') count++;
                break;
            }
            up--;
        }
        //check down
        while (down < n) {
            if (board[down][rook_pos[1]] != '.') {
                if (board[down][rook_pos[1]] == 'p') count++;
                break;
            }
            down++;
        }
        //check right
        while (right < n) {
            if (board[rook_pos[0]][right] != '.') {
                if (board[rook_pos[0]][right] == 'p') count++;
                break;
            }
            right++;
        }
        //check left
        while (left >= 0) {
            if (board[rook_pos[0]][left] != '.') {
                if (board[rook_pos[0]][left] == 'p') count++;
                break;
            }
            left--;
        }
        //return
        return count;
    }
}
