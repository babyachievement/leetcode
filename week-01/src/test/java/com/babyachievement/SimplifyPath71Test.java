package com.babyachievement;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * date: 2018/11/6 10:49
 */
public class SimplifyPath71Test {

    @Test
    public void simplifyPath() {
        final SimplifyPath71 simplifyPath71 = new SimplifyPath71();
        assertThat(simplifyPath71.simplifyPath("/"), is("/"));
        assertThat(simplifyPath71.simplifyPath("/.."), is("/"));
        assertThat(simplifyPath71.simplifyPath("/home/"), is("/home"));
        assertThat(simplifyPath71.simplifyPath("/a/./b/../../c/"), is("/c"));
        assertThat(simplifyPath71.simplifyPath("/../"), is("/"));
        assertThat(simplifyPath71.simplifyPath("/a/../../b/../c//.//"), is("/c"));
        assertThat(simplifyPath71.simplifyPath("/a//b////c/d//././/.."), is("/a/b/c"));
        assertThat(simplifyPath71.simplifyPath("/..hidden"), is("/..hidden"));
    }
}