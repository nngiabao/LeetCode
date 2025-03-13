package BST;

public class FindSmallestLetter_744 {
    public char nextGreatestLetter(char[] letters, char target) {
        int l=0,r=letters.length-1,mid,target_val=target-'a';
        if(letters[r]-'a' <= target_val) return letters[0];
        while(l<=r){
            mid=l+(r-l)/2;
            int mid_val = letters[mid]-'a';
            if(mid_val <= target_val){
                l=mid+1;
            }else{//less than mid
                r=mid-1;
            }

        }
        return letters[l];
    }
}
