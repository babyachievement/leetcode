package org.babyachievement.algorithms.binarytree;

import org.junit.Test;

import static org.junit.Assert.*;

public class SearchValueInA2DMatrixTest {

    @Test
    public void searchMatrix() {
        SearchValueInA2DMatrix searchMatrix = new SearchValueInA2DMatrix();
        int[][] matrix = new int[][]{
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 50}
        };
        assertTrue(searchMatrix.searchMatrix(matrix, 3));
        assertFalse(searchMatrix.searchMatrix(matrix, 13));
    }
}