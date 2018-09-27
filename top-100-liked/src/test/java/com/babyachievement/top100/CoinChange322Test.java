package com.babyachievement.top100;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * date: 2018/9/27 10:34
 */
public class CoinChange322Test {

    @Test
    public void coinChange() {
        final CoinChange322 change322 = new CoinChange322();
        assertThat(change322.coinChange(new int[]{1, 2, 5}, 11), is(3));
        assertThat(change322.coinChange(new int[]{2}, 3), is(-1));
    }
}