package com.babyachievement.solutions_5;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * FileName:ExpandAroundCenterTest
 * Created by HaoQiang
 * Date:17-7-30
 * Time:下午8:03
 */
public class ExpandAroundCenterTest {
    @Test
    public void longestPalindrome() throws Exception {
        ExpandAroundCenter longestPalindromicSubstring = new ExpandAroundCenter();
        String babad = longestPalindromicSubstring.longestPalindrome("babad");

        assertThat(babad, is("aba"));
        assertThat(longestPalindromicSubstring.longestPalindrome("cbbd"), is("bb"));
        assertThat(longestPalindromicSubstring.longestPalindrome("cbed"), is("d"));

    }

}