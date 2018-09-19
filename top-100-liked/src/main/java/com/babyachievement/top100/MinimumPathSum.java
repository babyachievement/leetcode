/**
 * date: 2018/9/18 11:21
 */

package com.babyachievement.top100;

/**
 * https://leetcode.com/problems/minimum-path-sum/description/
 */
public class MinimumPathSum {
    public int minPathSum(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length==0) {
            return 0;
        }
        int m = grid.length;
        int n = grid[0].length;
        int[][] v = new int[m][n];
        v[m - 1][n - 1] = grid[m-1][n-1];

        int right, down;
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {

                if (i == m - 1 && j == n - 1) {
                    continue;
                }
                if (j == n - 1) {
                    right = Integer.MAX_VALUE;
                } else {
                    right = v[i][j + 1];
                }

                if (i == m - 1) {
                    down = Integer.MAX_VALUE;
                } else {
                    down = v[i + 1][j];
                }

                v[i][j] = Math.min(right, down) + grid[i][j];
            }
        }

        return v[0][0];
    }
}
