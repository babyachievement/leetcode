package com.babyachievement.top100;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * date: 2018/9/26 11:13
 */
public class BestTimetoBuyAndSellStock121Test {

    @Test
    public void maxProfit() {
        final BestTimetoBuyAndSellStock121 bestTimetoBuyAndSellStock121 = new BestTimetoBuyAndSellStock121();
        assertThat(bestTimetoBuyAndSellStock121.maxProfit(new int[]{7, 1, 5, 3,
                6, 4}), is(5));
        assertThat(bestTimetoBuyAndSellStock121.maxProfit(new int[]{7, 6, 4, 3,
                1}), is(0));
        }
}