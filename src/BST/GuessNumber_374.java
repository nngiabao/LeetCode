package BST;

public class GuessNumber_374 {

    public static void main(String[] args) {
        System.out.println(guessNumber(10));
    }

    static int guess(int n) {
        int pickedNum = 6;
        if(n>pickedNum ) return -1;
        else if(n<pickedNum) return 1;
        return 0;
    }

    public static int guessNumber(int n) {
        int left = 1, right = n,mid;
        while(left <= right) {
            mid = left + (right - left) / 2;
            if(guess(mid)==0) return mid;
            if(guess(mid)==1) left=mid+1;
            else right=mid-1;
        }
        return left;
    }
}
