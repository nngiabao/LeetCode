package Greedy;

public class DistributeMoney_2591 {
    public static void main(String[] args) {
    }


    public int distMoney2(int money, int children) {
        //
        if (money < children) return -1;
        //
        int maxEights = Math.min((money - children) / 7, children);
        //
        int remaining = money - maxEights * 8;
        // If remaining money is 4 and only one child doesn't have 8
        if (remaining == 4 && children - maxEights == 1) {
            maxEights--;
        }
        return maxEights;
    }
}
