package com.babyachievement.solutions_28;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * File: ImplementStrStrTest.java
 * -------------------------------------------------
 * date: 2017/7/20 20:41
 *
 * @author babyachievement
 * @version version 1.0
 * @since 1.0
 */
public class ImplementStrStrTest {
    @Test
    public void strStr() throws Exception {
        ImplementStrStr implementStrStr = new ImplementStrStr();
        int i = implementStrStr.strStr("cddcdc", "cdc");
        assertThat(i, is(3));

        i = implementStrStr.strStr("ababcabcacbab", "abcac");
        assertThat(i, is(5));
    }

}