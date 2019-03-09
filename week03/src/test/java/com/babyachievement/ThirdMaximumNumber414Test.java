package com.babyachievement;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * date: 2019/3/8 10:00
 */
public class ThirdMaximumNumber414Test {

    @Test
    public void thirdMax() {
        final ThirdMaximumNumber414 thirdMaximumNumber414 = new ThirdMaximumNumber414();
//        assertThat(thirdMaximumNumber414.thirdMax(new int[]{3, 2, 1}), is(1));
//        assertThat(thirdMaximumNumber414.thirdMax(new int[]{2, 1}), is(2));
//        assertThat(thirdMaximumNumber414.thirdMax(new int[]{2, 1}), is(2));
//        assertThat(thirdMaximumNumber414.thirdMax(new int[]{2, 2, 3, 1}),
//                   is(1));
//        assertThat(thirdMaximumNumber414.thirdMax(new int[]{1, 1, 2}), is(2));
//        assertThat(thirdMaximumNumber414.thirdMax(new int[]{1, 2, -2147483648}),
//                   is(-2147483648));
//        assertThat(thirdMaximumNumber414.thirdMax(new int[]{1, -2147483648, -2147483648}),
//                   is(1));
//        assertThat(thirdMaximumNumber414.thirdMax(new int[]{-2147483648, -2147483648, -2147483648}),
//                   is(-2147483648));
//        assertThat(thirdMaximumNumber414.thirdMax(new int[]{1, -2147483648, -2147483648, 2}), is(-2147483648));
        assertThat(thirdMaximumNumber414.thirdMax(new int[]{-2147483648,
                                                  -2147483648,-2147483648,
                -2147483648,1,1,1}), is(1));
    }
}