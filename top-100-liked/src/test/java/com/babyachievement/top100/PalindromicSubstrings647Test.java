package com.babyachievement.top100;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * date: 2018/10/8 15:49
 */
public class PalindromicSubstrings647Test {

    @Test
    public void countSubstrings() {
        final PalindromicSubstrings647 palindromicSubstrings647 = new PalindromicSubstrings647();
        assertThat(palindromicSubstrings647.countSubstrings3("abc"), is(3));
        assertThat(palindromicSubstrings647.countSubstrings3("aaa"), is(6));
    }
}