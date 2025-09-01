package Greedy;

public class EarliestFinishTime_3633 {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int n = landStartTime.length, m = waterStartTime.length;
        int ans = Integer.MAX_VALUE;

        // Brute force both orders
        for (int i = 0; i < n; i++) {
            int landFinish = landStartTime[i] + landDuration[i];
            for (int j = 0; j < m; j++) {
                // Land -> Water
                int finish1 = Math.max(landFinish, waterStartTime[j]) + waterDuration[j];
                ans = Math.min(ans, finish1);

                // Water -> Land
                int waterFinish = waterStartTime[j] + waterDuration[j];
                int finish2 = Math.max(waterFinish, landStartTime[i]) + landDuration[i];
                ans = Math.min(ans, finish2);
            }
        }
        return ans;
    }
}
