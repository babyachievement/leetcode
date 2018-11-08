package com.babyachievement.top.interviews;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class Triangle120Test {

    @Test
    public void minimumTotal() {
        Triangle120 triangle120 = new Triangle120();
        assertThat(triangle120.minimumTotal2(Arrays.asList(
                Arrays.asList(-1), Arrays.asList(-2, -3)
        )), is(-4));
    }
}