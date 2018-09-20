/**
 * date: 2018/9/20 16:13
 */

package com.babyachievement.top100;

/**
 * https://leetcode.com/problems/number-of-islands/description/
 */
public class NumberofIslands200 {
    public int numIslands(char[][] grid) {
        int count = 0;
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return count;
        }
        final int m = grid.length;
        final int n = grid[0].length;


        char left = '0', right = '0', up = '0', down = '0';

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    left = j > 0 ? grid[i][j - 1] : '0';
                    right = j < n - 1 ? grid[i][j + 1] : '0';
                    up = i > 0 ? grid[i - 1][j] : '0';
                    down = i < m - 1 ? grid[i + 1][j] : '0';

                    final char max = (char) Math.max(left,
                                                     Math.max(right, Math.max
                                                             (up, down)));


                    if (max == '1' || max == '0') {
                        count++;
                        colorAround(grid, m, n, i, j, (char) (count + '1'));
                    } else {
                        colorAround(grid, m, n, i, j, max);
                    }
                }
            }
        }

        /**
         * recover
         */
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] != '1' && grid[i][j] != '0') {
                    grid[i][j] = '1';
                }
            }
        }
        return count;
    }

    private void colorAround(char[][] grid, int m, int n, int i, int j, char color) {

        if (i >= 0 && i < m && j >= 0 && j < n && grid[i][j] == '1') {
            grid[i][j] = color;
            if (j > 0) {
                colorAround(grid, m, n, i, j - 1, color);
            }

            if (j < n) {
                colorAround(grid, m, n, i, j + 1, color);
            }

            if (i > 0) {
                colorAround(grid, m, n, i - 1, j, color);
            }

            if (i < m) {
                colorAround(grid, m, n, i + 1, j, color);
            }
        }


       /*
        if (j > 0 && grid[i][j - 1] == '1')
            grid[i][j - 1] = color;
        if (j < n - 1 && grid[i][j + 1] == '1')
            grid[i][j + 1] = color;
        if (i > 0 && grid[i - 1][j] == '1')
            grid[i - 1][j] = color;
        if (i < m - 1 && grid[i + 1][j] == '1')
            grid[i + 1][j] = color;*/


    }

}
