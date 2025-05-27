package Array;

public class PartitionArrayIn3Parts_1013 {
    public boolean canThreePartsEqualSum(int[] arr) {
        //find prefix sum
        int len = arr.length;
        int[] presum = new int[len];
        presum[0] = arr[0];
        for(int i = 1; i < arr.length; i++) {
            presum[i] = arr[i] + presum[i - 1];
        }
        //find pointer i and j
        int total = presum[len - 1];
        if( total % 3 != 0) return false;
        int target = total/3;
        boolean firstFound = false;
        //keep finding partition
        for(int i = 0; i < len-1; i++) {
            //find first part
            if(!firstFound && target == presum[i]) firstFound = true;
            else if(firstFound && target*2 == presum[i]) return true;
        }
        return false;
    }
}
