/**
 * date: 2018/9/26 11:07
 */

package com.babyachievement.top100;

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
 */
public class BestTimetoBuyAndSellStock121 {
    public int maxProfit(int[] prices) {
        int min    = Integer.MAX_VALUE;
        int profit = 0;
        for (int price : prices) {
            if (price < min) {
                min = price;
            } else if (price - min > profit) {
                profit = price - min;
            }
        }

        return profit;
    }
}
