package String;

public class MinMovesConvertString_2027 {
    public static void main(String[] args) {
        MinMovesConvertString_2027 a = new MinMovesConvertString_2027();
        String s = "XXOX";
        a.minimumMoves(s);
    }

    public int minimumMoves(String s) {
        boolean isX = false;
        int count =0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == 'X') isX = true;
            else if(c == 'O'&& isX){
                count++;
                isX=false;
            }
        }
        return (isX) ? ++count : count;
    }
}
