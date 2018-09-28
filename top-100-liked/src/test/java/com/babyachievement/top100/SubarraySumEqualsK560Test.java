package com.babyachievement.top100;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * date: 2018/9/28 17:26
 */
public class SubarraySumEqualsK560Test {

    @Test
    public void subarraySum() {
        final SubarraySumEqualsK560 sumEqualsK560 = new SubarraySumEqualsK560();
        assertThat(sumEqualsK560.subarraySum(new int[]{1,1,1}, 2), is(2));
    }
}