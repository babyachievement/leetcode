package com.babyachievement.solutions_14;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * FileName:LongestCommonPrefixDivideAndConquerTest
 * Created by babyachievement
 * Date:17-7-19
 * Time:下午10:09
 */
public class LongestCommonPrefixDivideAndConquerTest {
    @Test
    public void longestCommonPrefix() throws Exception {
        LongestCommonPrefixDivideAndConquer longestCommonPrefix = new LongestCommonPrefixDivideAndConquer();

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