package com.babyachievement.top100;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * date: 2018/9/26 16:18
 */
public class BestTimeToBuyAndSellStockwithCooldownTest {

    @Test
    public void maxProfit() {
        final BestTimeToBuyAndSellStockwithCooldown sellStockwithCooldown = new BestTimeToBuyAndSellStockwithCooldown();
        assertThat(sellStockwithCooldown.maxProfit(new int[]{1, 2, 3, 0, 2}),
                   is(3));
    }
}