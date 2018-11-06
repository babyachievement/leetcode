package com.babyachievement;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * date: 2018/11/6 9:55
 */
public class Combinations77Test {

    @Test
    public void combine() {
        final Combinations77 combinations77 = new Combinations77();
        assertThat(combinations77.combine(4, 2).size(), is(6));
    }
}