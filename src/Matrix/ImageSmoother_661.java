package Matrix;

public class ImageSmoother_661 {
    public static void main(String[] args) {
        int[][] a = {{100, 200, 100}, {200, 50, 200}, {100, 200, 100}};
        ImageSmoother_661 d = new ImageSmoother_661();
        d.imageSmoother(a);
    }

    public int[][] imageSmoother(int[][] img) {
        int i = 0, j = 0;
        while (i < img.length && j < img[0].length) {
            //For the points (0,0), (0,2), (2,0), (2,2): floor(3/4) = floor(0.75) = 0
            int total = img[i][j] + img[i][j + 1] + img[i][j + 2]
                    + img[i + 1][j] + img[i + 1][j + 1] + img[i + 1][j + 2]
                    + img[i + 2][j] + img[i + 2][j + 1] + img[i + 2][j + 2];
            int col_bound = img[i][j + 2] + img[i + 1][j + 2];
            int row_bound = img[i + 2][j] + img[i + 2][j + 1] + img[i + 2][j + 2];
            ////update 4 corners
            int neigh_4 = (int) Math.floor((total - row_bound - col_bound) / 4);
            img[i][j] = neigh_4;
            img[i + 2][j] = neigh_4;
            img[i][j + 2] = neigh_4;
            img[i + 2][j + 2] = neigh_4;
            //up 4 points cross
            int neigh_6 = (int) Math.floor((total - row_bound) / 6);
            img[i][j + 1] = neigh_6;
            img[i + 1][j] = neigh_6;
            img[i + 1][j + 2] = neigh_6;
            img[i + 2][j + 1] = neigh_6;
            //update mid
            img[i + 1][j + 1] = (int) Math.floor(total / 9);
            i += 3;
            j += 3;
        }
        return img;
    }
}
