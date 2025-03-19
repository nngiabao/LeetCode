package Math;

public class UglyNumber_263 {
    public boolean isUgly(int n) {
        while(n > 1){
            if(n%5 != 0){
                if(n%3 != 0){
                    if(n%2 == 0) n/=2;
                    else return false;
                }else{

                }
            }else{

            }
        }
        return true;
    }

}
