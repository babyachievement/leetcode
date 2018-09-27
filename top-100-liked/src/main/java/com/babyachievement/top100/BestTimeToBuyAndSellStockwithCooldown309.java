/**
 * date: 2018/9/26 16:17
 */

package com.babyachievement.top100;

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/description/
 *
 */
public class BestTimeToBuyAndSellStockwithCooldown309 {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }

        final int[] profits = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            for (int j = 0; j < i; j++) {
                profits[i] = Math.max(profits[j], Math.max(profits[i], getProfit
                        (prices, profits, i, j)));
            }
        }

        return profits[prices.length - 1];
    }


    int getProfit(int[] prices, int[] profits, int i, int j) {
        if (j == 0 || j == 1) {
            return prices[i] - prices[j];
        }

        return profits[j - 2] + prices[i] - prices[j];
    }


    /**
     * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/discuss/75927/Share-my-thinking-process
     */
    public int maxProfit2(int[] prices) {
        int sell = 0, prev_sell = 0, buy = Integer.MIN_VALUE, prev_buy;
        for (int price : prices) {
            prev_buy = buy;
            buy = Math.max(prev_sell - price, prev_buy);
            prev_sell = sell;
            sell = Math.max(prev_buy + price, prev_sell);
        }
        return sell;
    }

}
