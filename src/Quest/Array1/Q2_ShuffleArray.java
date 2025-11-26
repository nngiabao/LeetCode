package Quest.Array1;

public class Q2_ShuffleArray {
    //using p2 pointers

    public int[] shuffle(int[] nums, int n) {
        int i=0,j=n,index=0;
        int[] res = new int[nums.length];
        while(i<n){
            res[index++] = nums[i];
            res[index++] = nums[j];
            i++;
            j++;
        }
        return res;
    }

    public static void main(String[] args) {
        Q2_ShuffleArray q = new Q2_ShuffleArray();
        q.shuffle(new int[]{2,5,1,3,4,7}, 3);
    }
}
