package BST;

public class KthMissingPosNum_1539 {
    public static void main(String[] args) {
        KthMissingPosNum_1539 obj = new KthMissingPosNum_1539();
        obj.findKthPositive(new int[]{2,3,4,7,11},5);

    }
    //Solution 1:Brute-force
    public int findKthPositive(int[] arr, int k) {
        int i=1;
        int index=0;
        while(k>0){
            if(index<arr.length && arr[index]==i){
                index++;
            }else{
                k--;
            }
            i++;
        }
        return i-1;
    }
    //Solution 2:BST

}
