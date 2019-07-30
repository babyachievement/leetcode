import java.util.Arrays;

/**
 * date: 2019/7/30 16:30
 */

public class BestTimeToBuyAndSellStockIV188 {
    public int maxProfit(int k, int[] prices) {
        if (prices == null || prices.length < 2) return 0;

        if (k >= prices.length / 2) { // buy-sell-II case, unlimited
            int maxProfit = 0;
            for (int i = 1; i < prices.length; ++i) {
                if (prices[i] > prices[i - 1])
                    maxProfit += prices[i] - prices[i - 1];
            }
            return maxProfit;
        }


        int[][] dp        = new int[k + 1][prices.length];
        int     maxProfit = 0;
        for (int i = 1; i <= k; i++) {
            int tempMax = dp[i - 1][0] - prices[0];
            for (int j = 1; j < prices.length; j++) {
                dp[i][j] = Math.max(dp[i][j - 1], prices[j] + tempMax);
                tempMax = Math.max(tempMax, dp[i - 1][j] - prices[j]);

                maxProfit = Math.max(maxProfit, dp[i][j]);
            }
        }

        return dp[k][prices.length - 1];
    }

    public int maxProfit2(int k, int[] prices) {
        if (prices == null || prices.length == 0 || k == 0) return 0;

        if (k >= prices.length / 2) {
            int maxPro = 0;
            for (int i = 1; i < prices.length; i++) {
                if (prices[i] > prices[i - 1])
                    maxPro += prices[i] - prices[i - 1];
            }
            return maxPro;
        }

        int[] dpHold = new int[k];
        Arrays.fill(dpHold, Integer.MIN_VALUE);
        int[] dpCash = new int[k];

        for (int price : prices) {
            dpHold[0] = Math.max(dpHold[0], -price);
            dpCash[0] = Math.max(dpCash[0], dpHold[0] + price);
            for (int i = 1; i < k; i++) {
                dpHold[i] = Math.max(dpHold[i], dpCash[i - 1] - price);
                dpCash[i] = Math.max(dpCash[i], dpHold[i] + price);
            }
        }
        return dpCash[k - 1];
    }
}
