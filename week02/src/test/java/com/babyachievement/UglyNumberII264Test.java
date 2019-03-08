package com.babyachievement;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class UglyNumberII264Test {

    @Test
    public void nthUglyNumber() {
        UglyNumberII264 uglyNumberII264 = new UglyNumberII264();
        assertThat(uglyNumberII264.nthUglyNumber(10), is(12));
    }
}