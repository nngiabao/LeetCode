package Math;

public class CalculateMoneyLeetcodeBank_1716 {
    public int totalMoney(int n) {
        int [] bank = {1,2,3,4,5,6,7};
        int sum=0;
        for(int i = 0; i < n; i++){
            int index = i%7;
            sum+=bank[index];
            bank[index]++;
        }
        return sum;
    }
}
