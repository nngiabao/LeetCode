package Array;

public class PlaceFlowers_605 {
    public static void main(String[] args) {
        int[] a = {0};
        int c = 1;
        System.out.println(canPlaceFlowers(a, c));
    }

    //Solution 1
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        //2 special edge
        //only first spot
        if (n == 0) return true;
        if (flowerbed.length == 1 && flowerbed[0] == 1) return false;
        boolean canPlace = true;
        int i = 0;
        while (n > 0 && i < flowerbed.length - 1) {
            if (flowerbed[i] != 0) {
                canPlace = false;
            } else {
                if (canPlace && flowerbed[i + 1] == 0) {
                    n--;
                    canPlace = false;
                } else canPlace = true;
            }
            i++;
        }
        if (canPlace && flowerbed[flowerbed.length - 1] == 0) n--;
        return (n == 0) ? true : false;
    }

    //Solution 2(optimize)
    public static boolean canPlaceFlowers2(int[] flowerbed, int n) {
        int len = flowerbed.length;
        for (int i = 0; i < len && n > 0; i++) {
            if (flowerbed[i] == 0) {
                int prev = (i == 0) ? 0 : flowerbed[i - 1];
                int next = (i == len - 1) ? 0 : flowerbed[i + 1];

                if (prev == 0 && next == 0) {
                    flowerbed[i] = 1; // plant a flower
                    n--;
                }
            }
        }

        return n == 0;
    }
}
