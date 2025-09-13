package Graph;

public class QueriesPointsInsideCircle_1828 {
    public int[] countPoints(int[][] points, int[][] queries) {
        int q = queries.length;
        int[] answer = new int[q];

        for (int j = 0; j < q; j++) {
            int cx = queries[j][0];
            int cy = queries[j][1];
            int r = queries[j][2];
            int r2 = r * r;  // radius squared

            int count = 0;
            for (int[] p : points) {
                int dx = p[0] - cx;
                int dy = p[1] - cy;
                if (dx * dx + dy * dy <= r2) {
                    count++;
                }
            }
            answer[j] = count;
        }
        return answer;
    }
}
