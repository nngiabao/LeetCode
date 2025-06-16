package Greedy;

public class GasStation_134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int fuel = 0;//fuel needed to move
        int start = 0;//index start
        int total = 0; // total gas need by sum(gas) - sum(cost)
        for(int i = 0; i < gas.length; i++){
            int gain = gas[i] - cost[i];
            total += gain;
            fuel += gain;
            if(fuel < 0){
                fuel = 0;
                start = i+1;//can reach
            }
        }
        return (total < 0) ? -1 : start;//check total is negative => no valid start for moving
    }
}
