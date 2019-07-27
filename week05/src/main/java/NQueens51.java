import java.util.ArrayList;
import java.util.List;

/**
 * date: 2019/7/19 10:58
 */

public class NQueens51 {
    public List<List<String>> solveNQueens(int n) {
        char[][]  plain   = new char[n][n];
        boolean[] rows    = new boolean[n];
        boolean[] columns = new boolean[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                plain[i][j] = '.';
            }
        }

        List<List<String>> result = new ArrayList<>();

        doSolveNQueens(plain, result, n, rows, columns, 0);

        return result;
    }

    private void doSolveNQueens(char[][] plain, List<List<String>> result, int n, boolean[] rows, boolean[] columns, int startRow) {
        final int length = rows.length;

        if (n == 0) {
            List<String> strs = new ArrayList<>();
            for (int i = 0; i < length; i++) {
                final StringBuilder stringBuilder = new StringBuilder();
                for (int j = 0; j < length; j++) {
                    stringBuilder.append(plain[i][j]);
                }
                strs.add(stringBuilder.toString());
            }
            result.add(strs);
            return;
        }

        if (startRow == length) {
            return;
        }


        for (int j = 0; j < length; j++) {
            if (columns[j]) continue;
            if (canPlaceQueen(rows, columns, startRow, j, plain)) {
                plain[startRow][j] = 'Q';
                rows[startRow] = true;
                columns[j] = true;
                doSolveNQueens(plain,
                               result,
                               n - 1,
                               rows,
                               columns,
                               startRow + 1);
                plain[startRow][j] = '.';
                rows[startRow] = false;
                columns[j] = false;
            }
        }
    }

    private boolean canPlaceQueen(boolean[] rows, boolean[] columns, int i, int j, char[][] plain) {
        if (rows[i] || columns[j]) {
            return false;
        }


        return checkTopLeft(plain, i, j) && checkTopRight(plain, i, j);
    }

    public boolean checkTopLeft(char[][] plain, int i, int j) {

        for (int k = 0; k < i; k++) {
            if (j - (i - k) >= 0 && plain[k][j - (i - k)] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public boolean checkTopRight(char[][] plain, int i, int j) {
        for (int k = j + 1; k < plain.length; k++) {
            if (i - (k - j) >= 0 && plain[i - (k - j)][k] == 'Q') {
                return false;
            }

        }
        return true;
    }


    public static void main(String[] args) {
        final NQueens51          nQueens51 = new NQueens51();
        final List<List<String>> x         = nQueens51.solveNQueens(8);
        int                      i         = 0;
        for (List<String> strings : x) {
            System.out.println("Solution " + (++i));
            for (String string : strings) {
                System.out.println(string);
            }
            System.out.println();
        }
        System.out.println(x);
        System.out.println(x.size());
    }
}
