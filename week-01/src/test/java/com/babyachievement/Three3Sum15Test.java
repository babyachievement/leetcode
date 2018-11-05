package com.babyachievement;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class Three3Sum15Test {

    @Test
    public void threeSum() {
        Three3Sum15 three3Sum15 = new Three3Sum15();


        assertThat(three3Sum15.threeSum(new int[]{-1, 0, 1, 2, -1, -4}).size(), is(2));
        assertThat(three3Sum15.threeSum(new int[]{-2, -2, -1, -1, 2, 4, 4}).size(), is(2));
    }
}