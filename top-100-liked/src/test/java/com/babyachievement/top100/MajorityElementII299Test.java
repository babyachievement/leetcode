package com.babyachievement.top100;

import org.junit.Test;

import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertThat;

/**
 * date: 2018/9/19 21:49
 */
public class MajorityElementII299Test {

    @Test
    public void majorityElement() {
        final MajorityElementII299 majorityElementII299 = new MajorityElementII299();
        assertThat(majorityElementII299.majorityElement(new int[]{3, 2, 3}),
                   hasSize(1));
        assertThat(majorityElementII299.majorityElement(new int[]{1,1,1,3,3,2,2,2}),
                   hasSize(2));
    }
}