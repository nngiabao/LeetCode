
package Array;

public class TriMaxNumber_414 {
    public static void main(String[] args) {
        int[]nums = {-2147483648,-2147483648,-2147483648,-2147483648,1,1,1};
        System.out.println(thirdMax(nums));;
    }

    //Solution 1
    public static int thirdMax(int[] nums) {
        //if dup => skip
        Integer max1=null,max2=null,max3=null;
        for(Integer i:nums){
        if(i == (max3) || i == (max2 )  || i == (max1 ) ) continue;
        if (max1==null || i > max1 ) {
                max3 = max2;
                max2 = max1;
                max1 = i;
            }else if( max2== null || i>max2){
                max3 = max2;
                max2 = i;
            }else if(max3== null || i>max2){
                max3 = i;
            }
        }
        return max3==null ? max1 : max3;
    }
}
