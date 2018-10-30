package com.babyachievement.top.interviews;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * date: 2018/10/30 11:15
 */
public class ReverseBits191Test {

    @Test
    public void reverseBits() {
        final ReverseBits191 reverseBits191 = new ReverseBits191();
        assertThat(reverseBits191.reverseBits(43261596), is(964176192));
    }
}