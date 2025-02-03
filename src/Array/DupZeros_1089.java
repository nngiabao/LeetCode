package Array;

public class DupZeros_1089 {
    public static void main(String[] args) {

    }

    //without extra spcae
    //we have to modify in-place
    public void duplicateZeros(int[] arr) {
        //first pass
        int i=0,count=0,n=arr.length;
        while(count < n) {
            if(arr[i]==0) count+=2;
            else count++;
            i++;
        }

        i--; // in case no 0
        int j=arr.length-1; // go backward
        while(j>0){
            if(arr[i]==0){
                if( count -1 < n) arr[j]=0; // dup 0
                j--;
                 arr[j]=0;
            }else{
                arr[j]=arr[i];
            }
            j--;
            i--;
        }
    }
}
