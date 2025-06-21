package Array;

public class DistanceBetweenBusStops_1184 {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        //edge
        //if start > destination
        //we swap 2 points
        if(start>destination){
            int temp = start;
            start=destination;
            destination=temp;
        }
        //find distance from start to destination
        //counter-clockwise = total distance - clockwise
        int countDistance =0;
        int totalDistance = 0;

        //we compare 2 direction => take min
        for(int i=0;i<distance.length;i++){
            totalDistance+=distance[i];
            if(i >= start && i <= destination) countDistance+=distance[i];
        }
        return Math.min(countDistance, totalDistance-countDistance);
    }
}
