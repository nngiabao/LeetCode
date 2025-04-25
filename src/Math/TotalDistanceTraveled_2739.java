package Math;

public class TotalDistanceTraveled_2739 {
    public static void main(String[] args) {
        TotalDistanceTraveled_2739 a= new TotalDistanceTraveled_2739();
        System.out.println(a.distanceTraveled(5,10));;
    }
    public int distanceTraveled(int mainTank, int additionalTank) {
        //check how many we can add to main
        int i=1;
        while(additionalTank >0 && i <= mainTank){
            if(i%5==0){
                mainTank++;
                additionalTank--;
            }
            i++;
        }
        return mainTank*10;
    }
}
