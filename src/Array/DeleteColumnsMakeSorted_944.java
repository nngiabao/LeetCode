package Array;

public class DeleteColumnsMakeSorted_944 {
    public static void main(String[] args) {
        DeleteColumnsMakeSorted_944 a = new DeleteColumnsMakeSorted_944();
        String [] strs = {"a","b"};
        System.out.println( a.minDeletionSize(strs));
    }

    public int minDeletionSize(String[] strs) {
        if(strs.length == 1) return 0;
        int count=0;int index=0;
        for(int i=0;i<strs[0].length();i++){
            for(int j=1;j<strs.length;j++){
                if((strs[j].charAt(i) -'a') < (strs[j-1].charAt(i) -'a')){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
