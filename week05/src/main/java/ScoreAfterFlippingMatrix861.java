/**
 * date: 2019/7/19 10:24
 */

public class ScoreAfterFlippingMatrix861 {
    public int matrixScore(int[][] A) {
        int m = A.length;
        int n = A[0].length;

        for (int i = 0; i < m; i++) {
            if (A[i][0] == 0) {
                flipRow(A, i, n);
            }
        }

        int c = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                c = c + (A[j][i] == 1 ? 1 : 0);
            }
            if (c < (m - c)) {
                flipColumn(A, i, m);
            }
            c = 0;
        }


        int sum = 0;
        for (int i = 0; i < m; i++) {
            sum += rowToInt(A, i, n);
        }

        return sum;
    }

    public int rowToInt(int[][] A, int row, int n) {
        int s = 0;
        int t = 1;
        for (int i = n-1; i>=0; i--) {

            s += A[row][i]*t;
            t = t * 2;
        }

        return s;
    }

    public void flipColumn(int[][] A, int column, int m) {
        for (int i = 0; i < m; i++) {
            A[i][column] = 1 - A[i][column];
        }
    }

    public void flipRow(int[][] A, int row, int n) {
        for (int i = 0; i < n; i++) {
            A[row][i] = 1 - A[row][i];
        }
    }

    public static void main(String[] args) {
        final ScoreAfterFlippingMatrix861 matrix861 = new ScoreAfterFlippingMatrix861();
        System.out.println(matrix861.matrixScore(new int[][]
                                                         {{0, 0, 1, 1}, {1, 0, 1, 0}, {1, 1, 0, 0}}
        ));

    }
}
