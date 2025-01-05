public class MergeSort_88 {
    static int[]nums1 = {1},nums2 = {};
    static int[]temp;
    public static void main(String[] args) {
        int m = 1,n=0;
        merge(nums1, m,nums2,n);
        temp = new int[m+n];
        for(int i: temp){
            System.out.println(i);
        }
    }
    //solution 1:
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0,j=0,k=0;
        //int[] temp = new int[m+n];
       while(i<m+n){
           if(j<m){
               if(nums1[j]>nums2[k] && nums2.length !=0){
                   temp[i++]= nums2[k++];
               }else{
                   temp[i++] = nums1[j++];
               }
           }
           temp[i++] = nums2[k++];
       }
       //nums1 = temp;
    }

    //solution 2:
    public static void merge2(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1,j=n-1,k=m+n-1;
        while(j>=0){
            if(i>=0 && nums1[i]>nums2[j]){
                nums1[k--] = nums1[i--];
                i--;
            }else{
                nums1[k--] = nums2[j--];
            }
        }
    }


}
