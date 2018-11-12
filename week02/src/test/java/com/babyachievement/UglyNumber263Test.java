package com.babyachievement;

import org.junit.Test;

import static org.junit.Assert.*;

public class UglyNumber263Test {

    @Test
    public void isUgly() {
        UglyNumber263 uglyNumber263 = new UglyNumber263();
        assertTrue(uglyNumber263.isUgly(6));
        assertTrue(uglyNumber263.isUgly(8));
        assertFalse(uglyNumber263.isUgly(14));
    }
}