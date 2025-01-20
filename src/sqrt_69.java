public class sqrt_69 {
    public static void main(String[] args) {
        System.out.println(mySqrt(2147395599));
    }

    //BST
    //because mid*mid cannot > x => we find the range like normal BST
    public static int mySqrt(int x) {
        int left = 0,right = x,mid;
        while(left <= right) {
            mid = left + (right - left) / 2;
            if((long) mid*mid == x) return mid;
            if((long)mid*mid > x) right = mid - 1;
            else left = mid + 1;
        }
        return right;
    }
}
