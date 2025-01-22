public class ClimbingStairs_70 {

    //Fast but memory really large
    public int climbStairs(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;
        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    //SOlution 2 - slower but satisfied for memory space
    public int climbStairs2(int n) {
        if(n<2){
            return n;
        }

        int first  = 1;
        int second = 2;
        int tmp = 0;

        for(int i =3; i<=n;i++) {
            tmp = second;
            second+=first;
            first = tmp;
        }
        return second;
    }
}
