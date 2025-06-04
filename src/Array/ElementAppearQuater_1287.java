package Array;

public class ElementAppearQuater_1287 {
    public int findSpecialInteger(int[] arr) {
        int len = arr.length;
        if (len < 3) return arr[0];
        int quarter = len / 4+1;
        int start=0;
        for(int i = 1; i < len; i++){
            if(arr[i] != arr[i-1]){
                if(i-start-1 > quarter) return arr[start];
                start=i;
            }

        }
        return arr[len-1];
    }
}
