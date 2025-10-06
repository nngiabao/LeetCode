package BST;

public class PeakIndexMountainArray_852 {
    public int peakIndexInMountainArray(int[] arr) {
        //
        int n = arr.length;
        int left = 0, right = n - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] < arr[mid + 1]) {//it means the peek is on the rgiht side
                right = mid;
            } else {//it means the peek is on the left side
                left = mid+1;
            }
        }
        //
        return left;
    }
}
