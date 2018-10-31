package com.babyachievement.top.interviews;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * date: 2018/10/31 15:08
 */
public class HappyNumber202Test {

    @Test
    public void isHappy() {
        final HappyNumber202 happyNumber202 = new HappyNumber202();
        assertTrue(happyNumber202.isHappy(19));
    }
}