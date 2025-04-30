package String;

public class ShortestDistance_821 {
    public static void main(String[] args) {
        char c = 'e';
        String s = "loveleetcode";
        for(int i : shortestToChar(s,c)) System.out.println(i);


    }
    public static int[] shortestToChar(String s, char c) {
        //2 pointers
        //2 pass
        int i = 0, j = 0;
        //create int[]res
        int[] res = new int[s.length()];
        int index = 0;
        while (index < s.length()) {
            //move pointer j to finding char
            //find first char in pointer i
            while (j < s.length() && s.charAt(i) != c) i++;
            //find second char in pointer i
            while (j < s.length() && s.charAt(j) != c || j==i ) j++;

            int i_distance = Math.abs(i-index);
            //check with the nearest
            if(j < s.length()){
                //distance from i
                //distance from j
                //then return the closest
                int j_distance = Math.abs(j-index);
                res[index] = Math.min(i_distance,j_distance);
            }else{
                res[index] = i_distance;
            }
            index++;
            //start to move pointer if index = j
            if(j < s.length() && index==j) i=j;
        }
        return res;
    }
}
