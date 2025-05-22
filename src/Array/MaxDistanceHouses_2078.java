package Array;

public class MaxDistanceHouses_2078 {
    public static void main(String[] args) {
        MaxDistanceHouses_2078 a = new MaxDistanceHouses_2078();
int[] c = {1,1,1,6,1,1,1};
        System.out.println(a.maxDistance(c));
    }
    //Solution 1:Using 2 pointers

    public int maxDistance(int[] colors) {
        //using 2
        int len = colors.length;
        if (len == 2) return 1;
        int i = 0, j = len - 1;
        //1 travels from left to right and another travels from the opposite way
        while (i < len) {
            if (colors[i] != colors[len - 1]) break;
            i++;
        }
        while (j > 0) {
            if (colors[j] != colors[0]) break;
            j--;
        }
        //
        return Math.max(i-len-1-i, j);
    }
}
