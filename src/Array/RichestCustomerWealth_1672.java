package Array;

public class RichestCustomerWealth_1672 {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            maxWealth = Math.max(maxWealth, sum);
        }
        return maxWealth;
    }
}
