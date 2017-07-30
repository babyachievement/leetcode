package com.babyachievement.solutions_5;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * FileName:LongestPalindromicSubstringTest
 * Created by HaoQiang
 * Date:17-7-30
 * Time:下午7:02
 */
public class LongestPalindromicSubstringTest {
    LongestPalindromicSubstring longestPalindromicSubstring;

    @Before
    public void setUp() throws Exception {
        longestPalindromicSubstring = new LongestPalindromicSubstring();
    }

    @Test
    public void longestPalindrome() throws Exception {
        String babad = longestPalindromicSubstring.longestPalindrome("babad");
        assertThat(babad, is("bab"));
        assertThat(longestPalindromicSubstring.longestPalindrome("cbbd"), is("bb"));
        assertThat(longestPalindromicSubstring.longestPalindrome("cbed"), is("c"));
    }

    @Test
    public void testIsPalindromic() throws Exception {
        assertTrue(longestPalindromicSubstring.isPalindromic("bab".toCharArray(), 0, 2));
        assertFalse(longestPalindromicSubstring.isPalindromic("aab".toCharArray(), 0, 2));
        assertTrue(longestPalindromicSubstring.isPalindromic("".toCharArray(), 0, 0));
    }
}