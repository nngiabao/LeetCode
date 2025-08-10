package Matrix;

public class DetermineColor_1812 {
    public boolean squareIsWhite(String coordinates) {
        //if both even or both odd => black
        //otherwise => white
        int col = coordinates.charAt(0) - 'a';
        int row = coordinates.charAt(1) - '0'-1;
        //
        return (((col &1)==1 && (row &1) == 1) || ((col &1)==0 && (row &1) == 0)) ? false : true;
    }
}
