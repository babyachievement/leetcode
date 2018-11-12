package com.babyachievement;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class GrayCode89Test {

    @Test
    public void grayCode() {
        GrayCode89 grayCode89 = new GrayCode89();
        assertThat(grayCode89.grayCode(2).size(), is(4));
        assertThat(grayCode89.grayCode(0).size(), is(1));
    }
}