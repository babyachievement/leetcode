package com.babyachievement.solutions_14;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * FileName:LongestCommonPrefixTest
 * Created by HaoQiang
 * Date:17-7-19
 * Time:下午8:57
 */
public class LongestCommonPrefixTest {
    @Test
    public void longestCommonPrefix() throws Exception {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

        String[] strs = {};
        String emptyPrefix = longestCommonPrefix.longestCommonPrefix(strs);
        assertTrue(emptyPrefix.isEmpty());

        assertTrue(longestCommonPrefix.longestCommonPrefix(null).isEmpty());

        String[] strs2 = {"leets", "leetcode", "leet", "leeds"};
        String commonPrefix2 = longestCommonPrefix.longestCommonPrefix(strs2);
        assertThat(commonPrefix2, is("lee"));

        String[] str3 = {"leetcode", "leetcode", "leetcode", "leetcode"};
        String commonPrefix3 = longestCommonPrefix.longestCommonPrefix(str3);
        assertThat(commonPrefix3, is("leetcode"));

        String[] str4 = {"a", "b"};
        String commonPrefix4 = longestCommonPrefix.longestCommonPrefix(str4);
        assertTrue(commonPrefix4.isEmpty());
    }

}
