package com.babyachievement.top100;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * date: 2018/9/26 9:55
 */
public class ContainerWithMostWater11Test {

    @Test
    public void maxArea() {
        final ContainerWithMostWater11 mostWater11 = new ContainerWithMostWater11();
        assertThat(mostWater11.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}),
                   is(49));
    }
}