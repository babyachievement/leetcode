/**
 * date: 2019/7/30 16:00
 */

public class BestTimeToBuyAndSellStockIII123 {
    public int maxProfit(int[] prices) {
        int buyOne = Integer.MAX_VALUE;
        int buyTwo = Integer.MAX_VALUE;

        int profitOne = 0;
        int profitTwo = 0;
        for (int price : prices) {
            buyOne = Math.min(buyOne, price);
            profitOne = Math.max(profitOne, price - buyOne);

            buyTwo = Math.min(buyTwo, price - profitOne);
            profitTwo = Math.max(profitTwo, price - buyTwo);
        }

        return profitTwo;
    }
}
