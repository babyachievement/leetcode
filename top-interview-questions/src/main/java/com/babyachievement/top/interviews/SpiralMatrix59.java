/**
 * date: 2018/10/22 14:40
 */

package com.babyachievement.top.interviews;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/spiral-matrix-ii/description/
 */
public class SpiralMatrix59 {
    public int[][] generateMatrix(int n) {
        List<Integer> result = new ArrayList<>();
        int[][]       matrix = new int[n][n];
        if (n <= 0) {
            return matrix;
        }

        boolean[][] boundary = new boolean[matrix.length + 2][matrix[0].length + 2];
        for (int i = 0; i < boundary.length; i++) {
            boundary[i][0] = true;
            boundary[i][boundary[0].length - 1] = true;
        }

        for (int i = 0; i < boundary[0].length; i++) {
            boundary[0][i] = true;
            boundary[boundary.length - 1][i] = true;
        }

        int i = 1, j = 1;
        int count = 1;
        while (true) {
            if (!boundary[i][j]) {
                matrix[i - 1][j - 1] = count++;
                boundary[i][j] = true;
            }


            // 向上
            if (boundary[i][j - 1] && !boundary[i - 1][j]) {
                i--;
                continue;
            }

            // 向右
            if (boundary[i - 1][j] && !boundary[i][j + 1]) {
                j++;
                continue;
            }

            // 向下
            if (boundary[i][j + 1] && !boundary[i + 1][j]) {
                i++;
                continue;
            }


            // 向左
            if (boundary[i + 1][j] && !boundary[i][j - 1]) {
                j--;
                continue;
            }


            break;
        }

        return matrix;
    }
}
