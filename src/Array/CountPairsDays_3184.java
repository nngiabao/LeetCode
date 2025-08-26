package Array;

public class CountPairsDays_3184 {
    public int countCompleteDayPairs(int[] hours) {
        //
        int count = 0;
        ///
        int n = hours.length;
        for(int i = 0; i < n-1; i++){
            for(int j = i + 1; j < n; j++){
                if(((hours[i] + hours[j]) % 24) == 0) count++;
            }
        }
        ///
        ///
        return count;
    }
}
