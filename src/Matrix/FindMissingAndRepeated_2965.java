package Matrix;

public class FindMissingAndRepeated_2965 {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int repeated = -1;
        int missing = -1;
        int len = grid.length;
        int[] dic = new int[len*len];
        for(int i = 0; i < len; i++) {
            for(int j = 0; j < len; j++) {
                dic[grid[i][j]]++;
            }
        }
        //find missing num
        for(int i = 1; i < grid.length; i++) {
            if(dic[i] == 0) missing=i;
            if(dic[i] > 1) repeated=i;
        }
        return new int[]{repeated,missing};
    }
}
