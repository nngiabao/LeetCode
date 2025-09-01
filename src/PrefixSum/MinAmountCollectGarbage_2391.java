package PrefixSum;

public class MinAmountCollectGarbage_2391 {
    public int garbageCollection(String[] garbage, int[] travel) {
        int n = garbage.length;
        int total = 0;
        int lastM = 0, lastP = 0, lastG = 0;

        // 1) pickup time + track last occurrences
        for (int i = 0; i < n; i++) {
            String s = garbage[i];
            total += s.length();
            if (s.indexOf('M') != -1) lastM = i;
            if (s.indexOf('P') != -1) lastP = i;
            if (s.indexOf('G') != -1) lastG = i;
        }

        // 2) prefix sums of travel: pref[i] = time to reach house i from 0
        int[] pref = new int[n];
        for (int i = 1; i < n; i++) pref[i] = pref[i - 1] + travel[i - 1];

        // 3) add driving to last relevant house for each truck
        return total + pref[lastM] + pref[lastP] + pref[lastG];
    }
}
