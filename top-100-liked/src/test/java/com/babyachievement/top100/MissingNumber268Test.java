package com.babyachievement.top100;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * date: 2018/9/26 11:27
 */
public class MissingNumber268Test {

    @Test
    public void missingNumber() {
        final MissingNumber268 number268 = new MissingNumber268();
        assertThat(number268.missingNumber(new int[]{3, 0, 1}), is(2));
        assertThat(number268.missingNumber(new int[]{1}), is(0));
        assertThat(number268.missingNumber(new int[]{9,6,4,2,3,5,7,0,1}), is
                (8));
    }
}