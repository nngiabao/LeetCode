package Array;

public class bit1and2Char_717 {
    public boolean isOneBitCharacter(int[] bits) {

        //last bit not 0
        if(bits[bits.length-1] != 0) return false;
        //case 1: odd
        //case 2: even
        int i=0;
       while(i<bits.length){
            if(bits[i] == 0) i++;
            else i+=2;
       }
       return (i==bits.length-1) ? true : false;
    }
}
