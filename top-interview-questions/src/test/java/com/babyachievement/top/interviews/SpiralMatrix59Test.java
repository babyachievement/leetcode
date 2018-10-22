package com.babyachievement.top.interviews;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * date: 2018/10/22 15:27
 */
public class SpiralMatrix59Test {

    @Test
    public void generateMatrix() {
        final int[][] matrix = new SpiralMatrix59().generateMatrix(4);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.printf(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}