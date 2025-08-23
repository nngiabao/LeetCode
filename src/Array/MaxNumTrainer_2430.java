package Array;

import java.util.Arrays;

public class MaxNumTrainer_2430 {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int count=0;
        //sort increasing order
        Arrays.sort(players);
        Arrays.sort(trainers);
        //i is for players
        //j is for trainers
        int i=0,j=0;
        while(i<players.length && j<trainers.length){
            if(players[i]<=trainers[j]){
                count++;
            }else if(players[i]>trainers[j]){
                j++;
            }
        }
        //
        return count;
    }
}
