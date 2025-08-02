package Queue;

import java.util.*;
import java.util.Queue;

public class ReavelCards_950 {
    public int[] deckRevealedIncreasing(int[] deck) {
        //
        int len = deck.length;
        if(len == 0) return new int[0];
        Arrays.sort(deck);
        LinkedList<Integer> q = new LinkedList<>();
        q.add(deck[len-1]);
        //put it into a queue
        for(int i=deck.length-2;i>=0;i--){
            if (!q.isEmpty()) {
                q.addLast(q.pollFirst());  // Step 1: move top to bottom (reverse of step 2 in the original process)
            }
            q.addFirst(deck[i]);           // Step 2: put current card on top (it would have been revealed first)

        }
        //return back to int[]
        int[] res = new int[len];
        int index =0;
        while(!q.isEmpty()){
            res[index++] = q.poll();
        }
        return res;
    }
}
