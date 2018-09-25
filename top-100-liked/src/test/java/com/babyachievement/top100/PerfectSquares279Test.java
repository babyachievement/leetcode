package com.babyachievement.top100;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * date: 2018/9/25 20:30
 */
public class PerfectSquares279Test {

    @Test
    public void numSquares() {
        final PerfectSquares279 perfectSquares279 = new PerfectSquares279();
        assertThat(perfectSquares279.numSquare3(13), is(2));
        assertThat(perfectSquares279.numSquare3(4), is(1));
        assertThat(perfectSquares279.numSquare3(53), is(2));
        assertThat(perfectSquares279.numSquare3(12), is(3));
        assertThat(perfectSquares279.numSquare3(1), is(1));
        assertThat(perfectSquares279.numSquare3(62), is(3));
    }
}