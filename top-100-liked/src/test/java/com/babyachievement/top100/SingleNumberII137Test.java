package com.babyachievement.top100;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * date: 2018/9/26 11:37
 */
public class SingleNumberII137Test {

    @Test
    public void singleNumber() {
        final SingleNumberII137 singleNumberII137 = new SingleNumberII137();
        assertThat(singleNumberII137.singleNumber(new int[]{2, 2, 3, 2}), is
                (3));

        assertThat(singleNumberII137.singleNumber(new int[]{0, 1, 0, 1, 0, 1, 99}),
                   is(99));
    }
}