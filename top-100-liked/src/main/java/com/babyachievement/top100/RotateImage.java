package com.babyachievement.top100;

public class RotateImage {
    public void rotate(int[][] matrix) {
        /**
         * 按圈进行旋转，最外圈的顺时针移动n-1个位置，里边一圈顺时针移动n-3个位置
         *
         */

        int n = matrix.length;
        if (matrix == null || n == 1) {
            return;
        }

        int cycyle = 1;

        while (cycyle <= n / 2) {
            int move = n - cycyle * 2 + 1;

            for (int i = 0; i < n - 2 * cycyle + 1; i++) {
                int firstV = matrix[cycyle - 1][cycyle - 1];
                // 左边
                for (int j = 0; j < n - 2 * cycyle + 1; j++) {
                    matrix[j + cycyle - 1][cycyle - 1] = matrix[j + cycyle][cycyle - 1];
                }

                // 下边
                for (int j = 0; j < n - 2 * cycyle + 1; j++) {
                    matrix[n - cycyle][j + cycyle - 1] = matrix[n - cycyle][j + cycyle];
                }

                // 右边
                for (int j = n - cycyle; j > cycyle - 1; j--) {
                    matrix[j][n - cycyle] = matrix[j - 1][n - cycyle];
                }

                // 上边
                for (int j = n - cycyle; j > cycyle; j--) {
                    matrix[cycyle - 1][j] = matrix[cycyle - 1][j - 1];
                }

                matrix[cycyle - 1][cycyle] = firstV;

            }
            cycyle++;
        }

    }

    /**
     * @param matrix
     */
    public void rotate2(int[][] matrix) {
        int n = matrix.length;
        if (matrix == null || n == 1) {
            return;
        }


        /**
         * 上下交换
         */
        for (int s = 0; s < n / 2; s++) {
            for (int i = 0; i < n; i++) {
                int temp = matrix[s][i];
                matrix[s][i] = matrix[n - 1 - s][i];
                matrix[n - s - 1][i] = temp;
            }
        }

        /**
         * 对称交换
         */
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

}
