package com.babyachievement;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class PaintHouse256Test {

    @Test
    public void minCost() {
        PaintHouse256 paintHouse256 = new PaintHouse256();
        assertThat(paintHouse256.minCost(new int[][]{{14,2,11},{11,14,5},{14,3,10}}), is(10));
    }
}