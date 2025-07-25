package Array;

public class ReplaceMaximumRight_1299 {
    public int[] replaceElements(int[] arr) {
        //using 2 pointers
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            arr[i] = Integer.MIN_VALUE;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    arr[i] = arr[j];
                }
            }
        }
        arr[len - 1] = -1;
        return arr;
    }
    //Soluition 2:keep the highest from the left so we scan from the left
    public int[] replaceElements2(int[] arr) {
        int len = arr.length;
        int max = arr[len-1];
        //
        arr[len-1] = -1;
        for(int i=len-2;i>=0;i--){
            //
            if(arr[i] < max){
                //we have to swap it so next time we will have new max
                int temp = arr[i];
                max = arr[i];
                arr[i] = temp;
            }else max = arr[i];
        }
        return arr;
    }
}
