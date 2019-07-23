/**
 * date: 2019/7/19 13:59
 */

public class FlippingAnImage832 {
    public int[][] flipAndInvertImage(int[][] A) {
        // flip
        final int n = A[0].length;
        final int m = A.length;
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < m; j++) {
                int temp = A[j][i];
                A[j][i] = A[j][n - 1 - i];
                A[j][n - 1 - i] = temp;
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = 1 - A[i][j];
            }
        }

        return A;
    }

    public static void main(String[] args) {
        final FlippingAnImage832 flippingAnImage832 = new FlippingAnImage832();
        final int[][] a = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        final int[][] ints = flippingAnImage832.flipAndInvertImage(a);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(ints[i][j] + ' ');
            }
            System.out.println();
        }
    }
}
