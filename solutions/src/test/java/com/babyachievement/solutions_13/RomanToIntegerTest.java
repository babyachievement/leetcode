package com.babyachievement.solutions_13;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by Alvin on 2017/7/17.
 */
public class RomanToIntegerTest {
    @Test
    public void romanToInt() throws Exception {
        RomanToInteger romanToInteger = new RomanToInteger();
        assertThat(romanToInteger.romanToInt("V"), is(5));
        assertThat(romanToInteger.romanToInt("VI"), is(6));
        assertThat(romanToInteger.romanToInt("IV"), is(4));
        assertThat(romanToInteger.romanToInt("MMXVI"), is(2016));
    }

}