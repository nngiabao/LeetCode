package Math;

public class DesignParkingSystem_1603 {
    //create cap
    int maxBig,maxMedium,maxSmall;
    //create current spots
    int currentBig=0,currentMedium=0,currentSmall=0;

    public DesignParkingSystem_1603(int big, int medium, int small) {
        this.maxBig = big;
        this.maxMedium = medium;
        this.maxSmall = small;
    }

    public boolean addCar(int carType) {
        //car type
        //1 = big | 2 = medium | 3 = small
        if(carType == 1){
            if(currentBig+1 > maxBig) return false;
            else currentBig++;
        }else if (carType == 2){
            if(currentMedium+1 > maxMedium) return false;
            else currentMedium++;
        }else{
            if(currentSmall+1 > maxSmall) return false;
            else currentSmall++;
        }
        return true;
    }
}
