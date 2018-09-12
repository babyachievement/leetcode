package org.babyachievement.algorithms.binarytree;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * date: 2018/9/12 11:29
 */
public class SearchA2DMatrixIITest {

    @Test
    public void searchMatrix() {
        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };

        SearchA2DMatrixII searchA2DMatrixII = new SearchA2DMatrixII();
        assertTrue(searchA2DMatrixII.searchMatrix(matrix, 5));
        assertFalse(searchA2DMatrixII.searchMatrix(matrix, 20));

    }
}