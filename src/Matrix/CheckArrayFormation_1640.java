package Matrix;

public class CheckArrayFormation_1640 {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        //put into array
        int len = arr.length;
        int[] temp = new int[len];
        int index=0;
        for(int[] piece : pieces){
            for(int i = 0; i<piece.length; i++){
                temp[index++] = piece[i];
            }
        }
        //go forward
        boolean isCorrect = true;
        for(int i=0;i<len;i++){
            if(temp[i]!=arr[i]){
                isCorrect = false;
                break;
            }
        }
        if(isCorrect) return true;
        //
        isCorrect = true;
        index=0;
        for(int i=len-1;i>=0;i--){
            if(temp[i]!=arr[index--]){
                isCorrect = false;
                break;
            }
        }
        if(isCorrect) return true;
        return false;
    }
}
