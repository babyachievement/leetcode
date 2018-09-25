package com.babyachievement.top100;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * date: 2018/9/25 19:34
 */
public class FindTheDuplicateNumber287Test {

    @Test
    public void findDuplicate() {
        final FindTheDuplicateNumber287 duplicateNumber287 = new FindTheDuplicateNumber287();
        final int                       duplicate          = duplicateNumber287.findDuplicate(
                new int[]{1, 3, 4, 2, 2});
        assertThat(duplicate, is(2));
    }
}