import java.util.PriorityQueue;

public class RelativeRanks_506 {
    public static void main(String[] args) {

    }

    //SOlution 1
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> score[b]-score[a]);

        String[] ranks = new String[score.length];
        for(int i=0; i<score.length; i++) {
            pq.offer(i);
        }
        int place =1;
        while(!pq.isEmpty()) {
            int index = pq.poll();
            if(place==1) ranks[index]="Gold Medal";
            if(place==2) ranks[index]="Silver Medal";
            if(place==3) ranks[index]="Bronze Medal";
            else ranks[index]= String.valueOf(place);
            place++;
        }
        return ranks;
    }


    //Solution 2
    //hash map assign rank to value

}
