package com.babyachievement;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * date: 2019/3/6 18:12
 */
public class AssignCookies455Test {

    @Test
    public void findContentChildren() {
        final AssignCookies455 assignCookies455 = new AssignCookies455();
        assertThat(assignCookies455.findContentChildren(new int[]{1, 2, 3},
                                                        new int[]{1, 1}),
                   is(1));
        assertThat(assignCookies455.findContentChildren(new int[]{1, 2, 3},
                                                        new int[]{1, 2}),
                   is(2));
    }
}