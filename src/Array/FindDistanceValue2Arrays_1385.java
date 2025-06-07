package Array;

public class FindDistanceValue2Arrays_1385 {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        boolean isValid = true;
        int count=0;
        for(int i=0;i<arr1.length;i++){
            isValid = true;
            for(int j=0;j<arr2.length;j++){
                if(Math.abs(arr1[i]-arr2[j])<=d){
                    isValid = false;
                    break;
                }
            }
            if(isValid) count++;
        }
        return count;
    }
    //Solution 2:using BST
    public int findTheDstanceValue2(int[] arr1, int[] arr2, int d){
        return 1;
    }
}
