package com.babyachievement;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * date: 2018/11/16 10:10
 */
public class AddDigits258Test {

    @Test
    public void addDigits() {
        final AddDigits258 addDigits258 = new AddDigits258();
        assertThat(addDigits258.addDigits(38), is(2));
        assertThat(addDigits258.addDigits(3), is(3));;
        assertThat(addDigits258.addDigits(16), is(7));;
    }
}