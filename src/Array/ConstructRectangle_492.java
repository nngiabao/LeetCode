package Array;

public class ConstructRectangle_492 {
    public int[] constructRectangle(int area) {
        int l = (int) Math.sqrt(area);
        while(l >0){
            if(area % l == 0){
                return new int[]{area/l,l};
            }
            l--;
        }
        return new int[]{area,1};
    }
}
