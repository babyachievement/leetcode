package org.babyachievement.algorithms.binarytree;

/**
 *
 */
public class SearchValueInA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null) {
            return false;
        }

        if (matrix.length == 0) {
            return false;
        }
        int m = matrix.length;
        int n = matrix[0].length;

        int low = 0;
        int high = m * n - 1;
        int mid, midV;

        while (low <= high) {
            mid = (low + high) / 2;
            midV = matrix[mid / n][mid % n];

            if (midV == target) {
                return true;
            }

            if (midV > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return false;
    }
}
