package Math;

public class ValidBomeraang_1037 {
    public static void main(String[] args) {
        System.out.println(isBoomerang(new int[][]{{1,1},{2,3},{3,2}}));
    }
    public static  boolean isBoomerang(int[][] points) {
        //use formala
        // 1/2(x1(y2-y3) + x2(y3-y1) + x3(y1-y2))
        //x1 = points[0][0]
        //y1 = points[0][1]
        //x2 = points[1][0]
        //y2 = points[1][1]
        //x3 = points[2][0]
        //y3 = points[2][1]
        return points[0][0]*(points[1][1]-points[2][1])
                + points[1][0]*(points[2][1]-points[0][1])
                + points[2][0]*(points[0][1]-points[1][1])!=0 ;
    }
}
