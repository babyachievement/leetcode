/**
 * date: 2018/10/23 10:10
 */

package com.babyachievement.top.interviews;

import static java.lang.Integer.max;

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/
 */
public class BestTimeToBuyAndSellStockII122 {
    int maxProfit(int[] prices) {
        int result = 0;
        for (int p = 1; p < prices.length; ++p)
            result += max(prices[p] - prices[p - 1], 0);
        return result;
    }

    public int bruteForce(int[] prices) {

        int[][] profits = new int[prices.length][prices.length];

        for (int i = prices.length - 1; i >= 0; i--) {
            for (int j = i + 1; j < prices.length; j++) {
                profits[i][j] = Math.max(0, prices[j] - prices[i]);
                for (int k = i; k < j; k++) {
                    profits[i][j] = Math.max(profits[i][j],
                                             profits[i][k] + profits[k + 1][j]);
                }
            }
        }

        return profits[0][prices.length - 1];
    }


}
