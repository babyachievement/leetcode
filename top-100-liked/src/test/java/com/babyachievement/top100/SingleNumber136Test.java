package com.babyachievement.top100;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * date: 2018/9/26 10:40
 */
public class SingleNumber136Test {

    @Test
    public void singleNumber() {
        final SingleNumber136 singleNumber136 = new SingleNumber136();
        assertThat(singleNumber136.singleNumber(new int[]{2, 2, 1}), is(1));
        assertThat(singleNumber136.singleNumber(new int[]{4, 1, 2, 1, 2}),
                   is(4));
    }
}