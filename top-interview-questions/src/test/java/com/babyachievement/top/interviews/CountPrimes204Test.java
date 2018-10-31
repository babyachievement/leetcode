package com.babyachievement.top.interviews;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * date: 2018/10/31 15:15
 */
public class CountPrimes204Test {

    @Test
    public void countPrimes() {
        final CountPrimes204 countPrimes204 = new CountPrimes204();
        assertThat(countPrimes204.countPrimes(10), is(4));
    }
}