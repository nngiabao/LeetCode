package Array;

public class CountTestedDevices_2960 {
    //Solution 1:Using brute-foce
    public int countTestedDevices(int[] batteryPercentages) {
        return 1;
    }
    //Solution 2:
    public int countTestedDevices2(int[] batteryPercentages) {
        int count = 0;
        for(int i = 0; i < batteryPercentages.length; i++) {
            if (batteryPercentages[i] - count > 0) count++;
        }
        return count;
    }
}
