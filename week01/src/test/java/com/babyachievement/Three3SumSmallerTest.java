package com.babyachievement;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class Three3SumSmallerTest {

    @Test
    public void threeSumSmaller() {
        Three3SumSmaller three3SumSmaller = new Three3SumSmaller();
        assertThat(three3SumSmaller.threeSumSmaller(new int[]{-2,0,1,3}, 2), is(2));
    }
}