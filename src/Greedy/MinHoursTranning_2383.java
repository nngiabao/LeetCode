package Greedy;

import java.util.Arrays;

public class MinHoursTranning_2383 {
    public static void main(String[] args) {
        int b = 1,c=1;
        int [] energy = {1,1,1,1},experience = {1,1,1,50};
        MinHoursTranning_2383 a = new MinHoursTranning_2383();
        a.minNumberOfHours(b,c,energy,experience);
    }

    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        //find min enegery to fight
        int totalEnergy = 0;
        int totalHours = 0;
        for(int i:energy) {
            totalEnergy += i;
        }
        if(initialEnergy - totalEnergy <=0)
            totalHours = totalEnergy - initialEnergy +1;
        //find experience to fight
        //we have to fight with the lowest experience opponent
        //Arrays.sort(experience);
        for(int i:experience) {
            if( initialExperience <= i){
                int gap = i - initialExperience+1;
                totalHours += gap;
                initialExperience += gap;
            }
            initialExperience += i;
        }
        return totalHours;
    }
}
