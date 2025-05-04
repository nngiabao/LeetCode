package Matrix;

public class CheckStraightLine_1232 {
    public boolean checkStraightLine(int[][] coordinates) {

        for(int i=1; i<coordinates.length-1; i++) {
            if(coordinates[i][0] < coordinates[i-1][0] || coordinates[i][1] < coordinates[i-1][1]) return false;
        }
        return true;
    }
}
