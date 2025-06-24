package String;

public class PathCrossing_1496 {
    public boolean isPathCrossing(String path) {
        //
        int vertical=0,horizontal=0;
        //
        int i=0;
        while(i<path.length()){
            if(path.charAt(i)=='N'){
                horizontal++;
            }else if(path.charAt(i)=='S'){
                horizontal--;
            }else if(path.charAt(i)=='E'){
                vertical++;
            }else{
                vertical--;
            }
            if(vertical==0 && horizontal==0) return true;
            i++;
        }
        return false;
    }
}
