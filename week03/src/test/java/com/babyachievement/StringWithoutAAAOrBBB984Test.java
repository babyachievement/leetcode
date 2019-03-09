package com.babyachievement;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * date: 2019/3/8 11:06
 */
public class StringWithoutAAAOrBBB984Test {

    @Test
    public void strWithout3a3b() {
        final StringWithoutAAAOrBBB984 stringWithoutAAAOrBBB984 = new StringWithoutAAAOrBBB984();
        final String                   a3b                        = stringWithoutAAAOrBBB984
                .strWithout3a3b(3, 3);
        assertThat(a3b.length(), is(6));
        System.out.println(a3b);
        System.out.println(stringWithoutAAAOrBBB984.strWithout3a3b(1, 3));
        System.out.println(stringWithoutAAAOrBBB984.strWithout3a3b(1, 4));
    }
}