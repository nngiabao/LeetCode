package Bit;

public class CountTripletWithXOR_1442 {
    //Solution 1:O(n^2)
    public int countTriplets(int[] arr) {
        //
        int count = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int xor = 0;
            for (int j = i; j < arr.length; j++) {
                xor ^= arr[j];
                if (xor == 0 && j > i) {
                    count += (j - i);
                }
            }
        }
        //
        return count;
    }
    //Solution 2:
}
