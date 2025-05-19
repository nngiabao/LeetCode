package String;

public class MinMovesConvertString_2027 {
    public static void main(String[] args) {
        MinMovesConvertString_2027 a = new MinMovesConvertString_2027();
        String s = "XXOX";
        a.minimumMoves(s);
    }

    //using substring
    public int minimumMoves(String s) {
        //every X need 3 consecutive = 1 move
        int count=0,i=0;
        while(i< s.length()) {
            if(s.charAt(i)=='X') {
                i+=3;
                count++;
            }else{
                i++;
            }
        }
        return count ;
    }
}
