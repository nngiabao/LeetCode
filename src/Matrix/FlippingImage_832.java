package Matrix;

public class FlippingImage_832 {
    public int[][] flipAndInvertImage(int[][] image) {
        //
        for (int i = 0; i < image.length; i++) {
            int left = 0, right = image[i].length - 1;
            while (left < right) {
                //flip
                int temp = image[i][left];
                image[i][left] = image[i][right];
                image[i][right] = temp;

                //
                left++;
                right--;
            }
            //invert
            for (int j = 0; j < image[i].length; j++) {
                if (image[i][j] == 1) image[i][j] = 0;
                else image[i][j] = 1;
            }
        }
        //
        return image;
    }
}
