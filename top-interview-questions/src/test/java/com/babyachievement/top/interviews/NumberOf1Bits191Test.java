package com.babyachievement.top.interviews;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * date: 2018/10/31 13:48
 */
public class NumberOf1Bits191Test {

    @Test
    public void hammingWeight() {
        final NumberOf1Bits191 numberOf1Bits191 = new NumberOf1Bits191();
        assertThat(numberOf1Bits191.hammingWeight(11), is(3));
        assertThat(numberOf1Bits191.hammingWeight(Integer.MIN_VALUE), is(1));
    }
}