package Math;

public class HarshadNum_3099 {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        //sum of digit
        int sum = 0;
        //
        while(x > 0){
            sum += x % 10;;
            x /= 10;
        }
        return (x % sum == 0) ? sum : -1;
    }
}
