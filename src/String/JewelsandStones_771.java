package String;

public class JewelsandStones_771 {
    public int numJewelsInStones(String jewels, String stones) {
        int[] temp = new int[58];
        int count = 0;
        //put into temp
        for(int i=0;i<stones.length();i++) {
            temp[stones.charAt(i)-'A']++;
        }
        //retrive in temp
        for(int i=0;i<jewels.length();i++) {
            count+=temp[jewels.charAt(i)-'A'];
        }
        return count;
    }
}
