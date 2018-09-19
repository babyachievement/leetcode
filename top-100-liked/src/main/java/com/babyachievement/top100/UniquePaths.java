/**
 * date: 2018/9/18 10:27
 */

package com.babyachievement.top100;

/**
 * https://leetcode.com/problems/unique-paths/description/
 */
public class UniquePaths {
    public int uniquePaths(int m, int n) {
        int[][] v = new int[m][n];
        v[m - 1][n - 1] = 1;

        int right, down;
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {

                if (i == m - 1 && j == n - 1) {
                    continue;
                }
                if (j == n - 1) {
                    right = 0;
                } else {
                    right = v[i][j + 1];
                }

                if (i == m - 1) {
                    down = 0;
                } else {
                    down = v[i + 1][j];
                }

                v[i][j] = down + right;
            }
        }
        return v[0][0];
    }
/*
    int findPath(int i, int j, int m, int n) {
        if (i >= m || j >= n) {
            return 0;
        }

        if (i == m - 1 && j == n - 1) {
            return 1;
        }


        // 右边+下边路径
        int right = findPath(i, j + 1, m, n);
        int down  = findPath(i + 1, j, m, n);

        return right + down;
    }*/
}
