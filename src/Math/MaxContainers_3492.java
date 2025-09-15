package Math;

public class MaxContainers_3492 {
    public int maxContainers(int n, int w, int maxWeight) {
        int totalWeight = n*n*w;
        return (totalWeight > maxWeight) ? maxWeight/w : n*n ;
    }
}
