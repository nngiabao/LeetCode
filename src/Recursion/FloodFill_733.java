package Recursion;

import java.util.Stack;

public class FloodFill_733 {
    //SOlution 1:Using stack
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        //
        if(image[sr][sc] == color ) return image;
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{sr, sc});
        int m = image.length;
        int n = image[0].length;
        int originalColor = image[sr][sc];
        //check neighboor
        //up: r-1,c
        //down: r+1,c
        //right: r,c+1
        //left: r,c-1
        //each element in this 2d array is 4 direction
        //color all neighboor is 1
        int[][] direction = {{-1,0},{1,0},{0,-1},{0,1}};
        while(!stack.isEmpty()) {
            int[] cell = stack.pop();
            image[cell[0]][cell[1]] = color;
            int row = cell[0];
            int col = cell[1];

            for(int[] dir : direction) {
                int newRow = row + dir[0];
                int newCol = col + dir[1];
                //check edge
                if (-1<newRow && newRow<m && -1<newCol && newCol<n && image[newRow][newCol] == originalColor)
                    stack.push(new int[]{newRow, newCol});
            }
        }
        return image;
    }
}
