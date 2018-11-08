package com.babyachievement.top.interviews;

import java.util.List;

/**
 * https://leetcode.com/problems/triangle/description/
 */
public class Triangle120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        int rows = triangle.size();
        int[] dp = new int[rows * (rows + 1) / 2];

        dp[0] = triangle.get(0).get(0);

        if (rows == 1) {
            return dp[0];
        }

        int min = Integer.MAX_VALUE;
        for (int i = 1; i < rows; i++) {
            int before = i * (i + 1) / 2;
            int preBefore = before - i;
            for (int j = 0; j < i + 1; j++) {
                int v = triangle.get(i).get(j);
                if (j == 0) {
                    dp[j + before] = v + dp[preBefore];
                } else if (j == i) {
                    dp[j + before] = v + dp[preBefore + j - 1];
                } else {
                    dp[j + before] = v + Math.min(dp[preBefore + j - 1], dp[preBefore + j]);
                }

                if (i == rows - 1) {
                    min = Math.min(dp[j + before], min);
                }
            }
        }

        return min;
    }

    public int minimumTotal2(List<List<Integer>> triangle) {
        int rows = triangle.size();
        int[] dp = new int[rows+1];

        for (int i = rows - 1; i >= 0; i--) {
            List<Integer> currentLevel = triangle.get(i);
            for (int j = 0; j < i + 1; j++) {
                dp[j] = Math.min(dp[j], dp[j + 1]) + currentLevel.get(j);
            }
        }

        return dp[0];

    }
}
