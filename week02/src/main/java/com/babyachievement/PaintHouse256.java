package com.babyachievement;

import java.util.Arrays;

/**
 * https://www.lintcode.com/problem/paint-house/description
 */
public class PaintHouse256 {
    /**
     * @param costs: n x 3 cost matrix
     * @return: An integer, the minimum cost to paint all houses
     */
    public int minCost(int[][] costs) {
        // write your code here
        int n = costs.length;

        int[] minCost = new int[3];
        for (int i = 0; i < n; i++) {
            if (i > 0) {
                int[] preCost = Arrays.copyOf(minCost, 3);
                minCost[0] = costs[i][0] + Math.min(preCost[1], preCost[2]);
                minCost[1] = costs[i][1] + Math.min(preCost[0], preCost[2]);
                minCost[2] = costs[i][2] + Math.min(preCost[0], preCost[1]);
            } else {
                minCost[0] = costs[0][0];
                minCost[1] = costs[0][1];
                minCost[2] = costs[0][2];
            }
        }


        return Math.min(minCost[0], Math.min(minCost[1], minCost[2]));
    }
}
