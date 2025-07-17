package LinkedList;

import java.util.Arrays;
import java.util.List;

public class SpiralMaxtrix4_2326 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] res = new int[m][n];

        // Fill all with -1 initially
        for (int i = 0; i < m; i++) {
            Arrays.fill(res[i], -1);
        }

        int top = 0, bottom = m - 1;
        int left = 0, right = n - 1;
        ListNode current = head;

        while (top <= bottom && left <= right && current != null) {
            // Move right
            for (int col = left; col <= right && current != null; col++) {
                res[top][col] = current.val;
                current = current.next;
            }
            top++;
            // Move down
            for (int row = top; row <= bottom && current != null; row++) {
                res[row][right] = current.val;
                current = current.next;
            }
            right--;
            // Move left
            for (int col = right; col >= left && current != null; col--) {
                res[bottom][col] = current.val;
                current = current.next;
            }
            bottom--;
            // Move up
            for (int row = bottom; row >= top && current != null; row--) {
                res[row][left] = current.val;
                current = current.next;
            }
            left++;
        }
        return res;
    }
}
