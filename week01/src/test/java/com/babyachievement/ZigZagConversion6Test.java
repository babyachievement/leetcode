package com.babyachievement;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * date: 2018/11/5 18:23
 */
public class ZigZagConversion6Test {

    @Test
    public void convert() {
        final ZigZagConversion6 zigZagConversion6 = new ZigZagConversion6();
        assertThat(zigZagConversion6.convert("PAYPALISHIRING", 3), is("PAHNAPLSIIGYIR"));
        assertThat(zigZagConversion6.convert("PAYPALISHIRING", 4), is
                ("PINALSIGYAHRPI"));
    }
}