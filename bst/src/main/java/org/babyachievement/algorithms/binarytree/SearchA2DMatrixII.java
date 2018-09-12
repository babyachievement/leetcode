package org.babyachievement.algorithms.binarytree;

/**
 * https://leetcode.com/problems/search-a-2d-matrix-ii/description/
 */
public class SearchA2DMatrixII {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int m = matrix.length;
        int n = matrix[0].length;

        /**
         * 从右上角开始查询
         */
        int row = 0;
        int col = n - 1;

        boolean result = false;
        while (col >= 0 && row < m) {
            if (matrix[row][col] == target) {
                result = true;
                break;
            }

            if (matrix[row][col] > target) {
                col = col - 1;
            } else {
                row = row + 1;
            }
        }
        return result;
    }
}
