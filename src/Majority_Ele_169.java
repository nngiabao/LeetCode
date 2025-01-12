import java.util.Hashtable;

public class Majority_Ele_169 {
    public static void main(String[] args) {

    }

    //Solution1
     static int majorityElement(int[] nums){
         Hashtable<Integer, Integer> m = new Hashtable<Integer, Integer>();
         int count=0;
         for(int i=0;i<nums.length;i++) {
             m.compute(nums[i], (k, v) -> {
                 //int value = m.get(k);
                 if (v != null) {
                     return v+1;
                 } else {
                     return 1;
                 }
             });
             int value = m.get(nums[i]);
             //System.out.println("key"+nums[i]+": "+value);
             if (value > nums.length/2){
                 System.out.println(nums[i]);
                 break;
             }
         }
        return 0;
    }
    //Solution 2
    public int majorityElement2(int[] nums) {
        int count=1,i=0,value=nums[0];
        Hashtable<Integer, Integer> table = new Hashtable<Integer, Integer>();
        while(count<nums.length/2){
            //table.computeIfAbsent(nums[i],  k -> {
              //  k += 1; }) ;;
            /*if(table.containsKey(nums[i])){
                //table.computeIfAbsent();
            }else{
                table.put(nums[i], 1);
            }*/
            //if()
        }
        return nums[nums.length/2];
    }


}
