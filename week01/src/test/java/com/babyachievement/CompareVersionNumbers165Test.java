package com.babyachievement;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CompareVersionNumbers165Test {

    @Test
    public void compareVersion() {
        CompareVersionNumbers165 compareVersionNumbers165 = new CompareVersionNumbers165();
        assertThat(compareVersionNumbers165.compareVersion("01", "1"), is(0));
        assertThat(compareVersionNumbers165.compareVersion("1.0", "1"), is(0));
        assertThat(compareVersionNumbers165.compareVersion("1.0.1", "1"), is(1));

    }
}