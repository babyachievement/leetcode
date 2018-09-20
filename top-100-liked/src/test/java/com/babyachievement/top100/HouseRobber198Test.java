package com.babyachievement.top100;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * date: 2018/9/20 15:53
 */
public class HouseRobber198Test {

    @Test
    public void rob() {
        final HouseRobber198 houseRobber198 = new HouseRobber198();
        final int            rob            = houseRobber198.rob(new int[]{1, 2, 3, 1});
        assertThat(rob, is(4));
    }
}