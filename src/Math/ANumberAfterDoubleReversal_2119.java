package Math;

public class ANumberAfterDoubleReversal_2119 {
    public static void main(String[] args) {
        StringBuilder reversed_str = new StringBuilder(Integer.toString(12300 )).reverse() ;
        System.out.println(reversed_str.toString()) ;
    }
    //Solution 1
    public boolean isSameAfterReversals(int num) {
        if(num == 0) return true ;
        //convert to String
        //then check 2 strings : original and reversed string
        //StringBuilder reversed_str = new StringBuilder(Integer.toString(num)).reverse() ;
        //if equal => true
        //if not => false
        return (num%10==0) ? false : true ;
    }
}
