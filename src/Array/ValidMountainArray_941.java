package Array;

public class ValidMountainArray_941 {
    public boolean validMountainArray(int[] arr) {
        if (arr.length == 1) return false;
        if(arr[0] >= arr[1]) return false;
        boolean isDecreasing = false;
        int i=2;
        while(i < arr.length) {
            if(arr[i] > arr[i-1] && isDecreasing) return false;
            if(arr[i] == arr[i-1]) return false;
            if(arr[i] < arr[i-1]) isDecreasing=true;
        }
        return true;
    }
}
