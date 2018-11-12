package com.babyachievement;

/**
 * https://www.lintcode.com/problem/paint-house-ii/description
 */
public class PaintHouseII265 {
    /**
     * @param costs: n x k cost matrix
     * @return: an integer, the minimum cost to paint all houses
     */
    public int minCostII(int[][] costs) {
        // write your code here
        if(costs.length==0||costs[0].length==0) return 0;
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        int minIndex = 0;
        for (int i = 0; i < costs[0].length; i++) {
            if (costs[0][i] < min) {
                secondMin = min;
                minIndex = i;
                min = costs[0][i];

            } else if (costs[0][i] < secondMin) {
                secondMin = costs[0][i];
            }
        }


        for (int i = 1; i < costs.length; i++) {
            int preMin = min;
            int preMinIndex = minIndex;
            int preSecondMin = secondMin;

            min = Integer.MAX_VALUE;
            secondMin = Integer.MAX_VALUE;
            for (int j = 0; j < costs[0].length; j++) {
                if (j == preMinIndex) {
                    if (costs[i][j] + preSecondMin < min) {
                        secondMin = min;
                        min = costs[i][j] + preSecondMin;
                        minIndex = j;
                    } else if (costs[i][j] + preSecondMin < secondMin) {
                        secondMin = costs[i][j] + preSecondMin;
                    }
                } else {
                    if (costs[i][j] + preMin < min) {
                        secondMin = min;
                        min = costs[i][j] + preMin;
                        minIndex = j;
                    } else if (costs[i][j] + preMin < secondMin) {
                        secondMin = costs[i][j] + preMin;
                    }
                }

            }
        }
        return min;
    }
}
