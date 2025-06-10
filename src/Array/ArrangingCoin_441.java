package Array;

public class ArrangingCoin_441 {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(5));
    }

    //time limit

    //Solution 1:Brute-force
    public static int arrangeCoins(int n) {
        int i = 1;//start from row 1
        int count=0;
        while (i <= n) {
            n -= i;
            count++;
            i++;
        }

        return count;
    }

    //BST
    public static int arrangeCoins2(int n) {
        int left = 0, right = n;
        //mid = k(k+1)/2 <= n
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long coinUsed = mid * (mid + 1) / 2;
            if(coinUsed == n) return mid;
            if (coinUsed < n) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right;
    }
}
