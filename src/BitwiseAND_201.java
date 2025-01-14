public class BitwiseAND_201 {
    public static void main(String[] args) {
        System.out.println(rangeBitwiseAnd(5,7));

    }

    public static int rangeBitwiseAnd(int left, int right) {
        int result=left;
        for(int i = left+1; i <= right; i++) {
            result &= i;
        }
        return result;
    }
}
