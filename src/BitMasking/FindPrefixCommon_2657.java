package BitMasking;

public class FindPrefixCommon_2657 {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int len = A.length;
        boolean[] a = new boolean[len];
        boolean[] b = new boolean[len];
        int[] res = new int[len];
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (a[B[i]] == true) count++;
            if ((b[A[i]] == true)) count++;
            a[A[i]] = true;
            b[B[i]] = true;
            res[i] = count;
        }
        return res;
    }
}
