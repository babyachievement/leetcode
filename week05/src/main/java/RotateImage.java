/**
 * date: 2019/7/17 15:40
 */

public class RotateImage {
    public void rotate(int[][] matrix) {

        int n = matrix.length;

        /**
         * 先上下调换
         */
        for(int i=0; i<n/2; i++) {
            for(int j=0; j<n;j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n-i-1][j];
                matrix[n-i-1][j] = temp;
            }
        }

        /**
         * 再对称调换
         */
        for(int i=0; i<n;i++) {
            for(int j=0; j<=i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

    }

    public static void main(String[] args) {
        final RotateImage rotateImage = new RotateImage();
        final int[][] matrix = {
                {1, 2, 3}, {4, 5, 6}, {7, 8, 9}
        };
        rotateImage.rotate(matrix);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(matrix[i][j]);
            }
        }
    }
}
