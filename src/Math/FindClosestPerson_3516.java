package Math;

public class FindClosestPerson_3516 {
    public int findClosest(int x, int y, int z) {
        int gap_1 = Math.abs(z - x);
        int gap_2 = Math.abs(z - y);
        if(gap_1 == gap_2) return 0;
        return (gap_1 < gap_2) ? 1 : 2;
    }
}
