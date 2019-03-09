package com.babyachievement;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * date: 2019/3/8 14:43
 */
public class BrokenCalculator991Test {

    @Test
    public void brokenCalc() {
        final BrokenCalculator991 calculator991 = new BrokenCalculator991();
        assertThat(calculator991.brokenCalc(1, 2), is(1));
        assertThat(calculator991.brokenCalc(2, 3), is(2));
        assertThat(calculator991.brokenCalc(5, 8), is(2));
        assertThat(calculator991.brokenCalc(1, 1000000000),is(39));
    }
}