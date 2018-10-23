package com.babyachievement.top.interviews;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * date: 2018/10/23 10:12
 */
public class BestTimeToBuyAndSellStockII122Test {

    @Test
    public void maxProfit() {
        final BestTimeToBuyAndSellStockII122 sellStockII122 = new BestTimeToBuyAndSellStockII122();
        assertThat(sellStockII122.maxProfit(new int[]{7, 1, 5, 3, 6, 4}),
                   is(7));
        assertThat(sellStockII122.maxProfit(new int[]{1, 2, 3, 4, 5}), is(4));
        assertThat(sellStockII122.maxProfit(new int[]{7, 6, 4, 3, 1}), is(0));
        assertThat(sellStockII122.maxProfit(new int[]{1, 3, 5, 4, 3, 7, 6, 9, 2, 4}),
                   is(13));

        int[] tenThousand = new int[10001];
        for (int i = 10000; i >= 0; i--) {
            tenThousand[10000 - i] = i;
        }
        System.out.println(
                sellStockII122.maxProfit(tenThousand)
        );

    }
}