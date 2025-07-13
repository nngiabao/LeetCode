package Heap;

import java.util.*;

public class FindKthSmallestElement_378 {
    //Solution 1:Basic
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                pq.add(matrix[i][j]);
            }
        }
        int count = 1;
        //
        while (!pq.isEmpty()) {
            int num = pq.poll();
            if (k == count) return num;
            count++;
        }
        return -1;
    }
    //Solution 2:Using BST - but really hard
    public class Solution {
        public int kthSmallest(int[][] matrix, int k) {
            int n = matrix.length;
            int low = matrix[0][0];
            int high = matrix[n - 1][n - 1];

            while (low < high) {
                int mid = low + (high - low) / 2;
                int count = countLessEqual(matrix, mid, n);

                if (count < k) {
                    low = mid + 1; // discard left half
                } else {
                    high = mid; // potential candidate, look left
                }
            }

            return low;
        }

        private int countLessEqual(int[][] matrix, int mid, int n) {
            int count = 0;
            int row = n - 1;
            int col = 0;

            while (row >= 0 && col < n) {
                if (matrix[row][col] <= mid) {
                    count += (row + 1);
                    col++;
                } else {
                    row--;
                }
            }

            return count;
        }
    }

}
