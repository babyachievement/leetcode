/**
 * date: 2018/9/21 11:10
 */

package com.babyachievement.top100;

/**
 * https://leetcode.com/problems/maximal-square/description/
 */
public class MaximalSquare221 {
    public int maximalSquare(char[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return 0;
        }

        int max = 0;
        int m   = matrix.length;
        int n   = matrix[0].length;

        int[][] square = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                square[i][j] = maxSquare(matrix, square, i, j);

                if (square[i][j] > max) {
                    max = square[i][j];
                }
            }
        }


        return max*max;
    }

    int maxSquare(char[][] matrix, int[][] square, int i, int j) {
        if (i < 0 || j < 0) {
            return 0;
        }

        if (matrix[i][j] == '0') {
            return 0;
        }

        int leftMax = getSquare(square, i, j - 1);
        int upMax   = getSquare(square, i - 1, j);

        int minMax = Math.min(leftMax, upMax);

        if (minMax == 0) {
            return 1;
        }

        if (square[i - minMax][j - minMax] == 0) {
            return minMax;
        }

        return minMax + 1;
    }

    int getSquare(int[][] square, int i, int j) {
        if (i < 0 || j < 0) {
            return 0;
        }

        return square[i][j];
    }
}
