public class ValidPerfectSqure_367 {
    public static void main(String[] args) {

    }

    public boolean isPerfectSquare(int num) {
        int left=0,right=num,mid;
        while(left<=right){
            mid=(left+right)/2;
            if((long)mid*mid==num) return true;
            else if((long)mid*mid>num) right=mid-1;
            else left=mid+1;
        }
        return false;
    }
}
