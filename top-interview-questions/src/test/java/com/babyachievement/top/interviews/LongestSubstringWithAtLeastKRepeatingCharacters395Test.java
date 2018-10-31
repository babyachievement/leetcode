package com.babyachievement.top.interviews;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * date: 2018/10/30 18:11
 */
public class LongestSubstringWithAtLeastKRepeatingCharacters395Test {

    @Test
    public void longestSubstring() {
        final LongestSubstringWithAtLeastKRepeatingCharacters395 leastKRepeatingCharacters395 = new LongestSubstringWithAtLeastKRepeatingCharacters395();
        assertThat(leastKRepeatingCharacters395.longestSubstring("aaabb", 3), is(3));
        assertThat(leastKRepeatingCharacters395.longestSubstring("ababbc", 2), is(5));
    }
}