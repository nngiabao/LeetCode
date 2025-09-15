package Array;

public class RestoreFinishingOrder_3668 {
    public int[] recoverOrder(int[] order, int[] friends) {
        //build the cage
        int[] cage = new int[101];
        //
        for(int i = 0; i < friends.length; i++){
            cage[friends[i]]++;
        }
        int[] res = new int[friends.length];
        //
        int index = 0;
        for(int i = 0; i < order.length; i++){
            if(cage[order[i]] == 1) res[index++] = order[i];
        }
        return res;
    }
}
