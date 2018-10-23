package com.babyachievement.top.interviews;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * date: 2018/10/22 15:39
 */
public class SetMatrixZeroes73Test {

    @Test
    public void setZeroes() {
        final SetMatrixZeroes73 setMatrixZeroes73 = new SetMatrixZeroes73();
        final int[][] matrix = {{1, 1, 1},
                {1, 0, 1}, {1, 1, 1}};
        setMatrixZeroes73.setZeroes(matrix);
        assertArrayEquals(matrix[1], new int[]{0, 0, 0});
    }
}