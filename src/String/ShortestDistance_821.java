package String;

public class ShortestDistance_821 {
    public static void main(String[] args) {
        char c = 'e';
        String s = "loveleetcode";
        System.out.println(shortestToChar(s,c));
    }
    public static int[] shortestToChar(String s, char c) {
        //2 pointers
        //2 pass
        int i = 0, j = 0;
        //create int[]res
        int[] res = new int[s.length()];
        while (i < s.length() && j < s.length()) {
            //move pointer j to finding char
            if (s.charAt(j) != c) j++;
            else{
                //move pointer i to j
                while (i <= j) {
                    res[i] = Math.abs(i-j);
                    i++;
                }
                j++;
            }
        }
        return res;
    }
}
