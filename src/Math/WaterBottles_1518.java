package Math;

public class WaterBottles_1518 {
    public int numWaterBottles(int numBottles, int numExchange) {
        int totalDrank = 0;
        int empty = 0;

        while (numBottles > 0) {
            totalDrank += numBottles;
            empty += numBottles;
            numBottles = empty / numExchange;
            empty = empty % numExchange;
        }
        return totalDrank;
    }
}
