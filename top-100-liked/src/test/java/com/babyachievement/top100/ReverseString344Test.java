package com.babyachievement.top100;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class ReverseString344Test {

    @Test
    public void reverseString() {
        ReverseString344 reverseString344 = new ReverseString344();
        assertThat(reverseString344.reverseString("hello"), is("olleh"));
        assertThat(reverseString344.reverseString("ello"), is("olle"));
    }
}