package com.babyachievement.solutions_28;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * File: ImplementStrStr2Test.java
 * -------------------------------------------------
 * date: 2017/7/20 20:49
 *
 * @author babyachievement
 * @version version 1.0
 * @since 1.0
 */
public class ImplementStrStr2Test {
    @Test
    public void strStr() throws Exception {
        ImplementStrStr2 implementStrStr = new ImplementStrStr2();
        int i = implementStrStr.strStr("cddcdc", "cdc");
        assertThat(i, is(3));

        i = implementStrStr.strStr("ababcabcacbab", "abcac");
        assertThat(i, is(5));

        i = implementStrStr.strStr("ababcabcacbab", "");
        assertThat(i, is(0));

        i = implementStrStr.strStr("", "");
        assertThat(i, is(0));


    }

}