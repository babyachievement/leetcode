package com.babyachievement;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * date: 2019/3/8 16:31
 */
public class IsSubsequence392Test {

    @Test
    public void isSubsequence() {
        final IsSubsequence392 isSubsequence392 = new IsSubsequence392();
        assertTrue(isSubsequence392.isSubsequence("abc", "ahbgdc"));
        assertFalse(isSubsequence392.isSubsequence("axc", "ahbgdc"));
    }
}