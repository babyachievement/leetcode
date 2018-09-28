package com.babyachievement.top100;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * date: 2018/9/28 12:46
 */
public class FindAllAnagramsInAString438Test {

    @Test
    public void findAnagrams() {
        final FindAllAnagramsInAString438 findAllAnagramsInAString438 = new FindAllAnagramsInAString438();
        final List<Integer>               anagrams                    = findAllAnagramsInAString438
                .findAnagrams2("cbaebabacd", "abc");
        assertThat(anagrams.size(), is(2));
        assertThat(anagrams.get(0), is(0));
        assertThat(anagrams.get(1), is(6));

        assertThat(findAllAnagramsInAString438.findAnagrams2("abab", "ab").size(), is(3));
    }
}