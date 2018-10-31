package com.babyachievement.top100;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * date: 2018/10/31 16:36
 */
public class FirstUniqueCharacterInString387Test {

    @Test
    public void firstUniqChar() {
        final FirstUniqueCharacterInString387 firstUniqueCharacterInString387 = new FirstUniqueCharacterInString387();


        assertThat(firstUniqueCharacterInString387.firstUniqChar("leetcode"), is(0));
        assertThat(firstUniqueCharacterInString387.firstUniqChar("loveleetcode"), is(2));
        assertThat(firstUniqueCharacterInString387.firstUniqChar("eett"), is(-1));
        assertThat(firstUniqueCharacterInString387.firstUniqChar("eet"), is(2));
    }
}