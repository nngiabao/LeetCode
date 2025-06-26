package String;

public class ShuffleString_1528 {

    public String restoreString(String s, int[] indices) {
        //
        char[] result = new char[indices.length];
        for(int i = 0; i < indices.length; i++){
            result[indices[i]] = s.charAt(i);
        }
        return new String(result);
    }
}
