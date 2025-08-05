package Array;

public class FruitsInBasket2_3477 {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        //Solution 1:
        boolean[] flag = new boolean[fruits.length];
        //
        int count = 0;
        boolean isPlaced = false;
        for (int i = 0; i < fruits.length; i++) {
            isPlaced = false;
            for (int j = 0; j < baskets.length; j++) {
                if (fruits[i] <= baskets[j] && flag[j] == false) {
                    flag[j] = true;
                    isPlaced = true;
                    break;
                }
            }
            if (!isPlaced) count++;
        }
        return count;
    }
    //Solution 2:BEST
    public int numOfUnplacedFruits2(int[] fruits, int[] baskets) {
        int i, j;
        int c = 0;
        for (i = 0; i < fruits.length; i++) {
            for (j = 0; j < baskets.length; j++) {
                if (fruits[i] <= baskets[j]) {
                    c = c + 1;
                    baskets[j] = 0;
                    break;
                }
            }
        }
        return fruits.length - c;
    }
}
