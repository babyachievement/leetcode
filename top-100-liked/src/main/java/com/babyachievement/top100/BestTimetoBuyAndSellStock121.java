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

    /**
     * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/discuss/39038/Kadane's-Algorithm-Since-no-one-has-mentioned-about-this-so-far-:)-(In-case-if-interviewer-twists-the-input)
     */
    public int maxProfit2(int[] prices) {
        int maxCur = 0, maxSoFar = 0;
        for (int i = 1; i < prices.length; i++) {
            maxCur = Math.max(0, maxCur += prices[i] - prices[i - 1]);
            maxSoFar = Math.max(maxCur, maxSoFar);
        }
        return maxSoFar;
    }
}
