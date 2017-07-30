package com.babyachievement.solutions_3;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * FileName:LongestSubstringLengthTest
 * Created by HaoQiang
 * Date:17-7-30
 * Time:下午5:58
 */
public class LongestSubstringLengthTest {

    private LongestSubstringLength longestSubstringLength;

    @Before
    public void setUp() throws Exception {
        longestSubstringLength = new LongestSubstringLength();
    }

    @Test
    public void lengthOfLongestSubstring() throws Exception {
        int abcabcbb = longestSubstringLength.lengthOfLongestSubstring("abcabcbb");
        assertThat(abcabcbb, is(3));
        assertThat(longestSubstringLength.lengthOfLongestSubstring("bbbbb"), is(1));
        assertThat(longestSubstringLength.lengthOfLongestSubstring("pwwkew"), is(3));
    }

}