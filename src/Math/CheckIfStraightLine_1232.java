package Math;

public class CheckIfStraightLine_1232 {
    public boolean checkStraightLine(int[][] coordinates) {
        if(coordinates.length == 2) return true;
        int x0 = coordinates[0][0];
        int y0 = coordinates[0][1];
        int x1 = coordinates[1][0];
        int y1 = coordinates[1][1];

        int dx = x1 - x0;
        int dy = y1 - y0;

        for (int i = 2; i < coordinates.length; i++) {
            int x = coordinates[i][0];
            int y = coordinates[i][1];
            if ((y - y0) * dx != (x - x0) * dy)
                return false;
        }
        return true;
    }


}
