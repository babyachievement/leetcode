package org.babyachievement.algorithms.binarytree;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class BinaryGapTest {

    @Test
    public void binaryGap() {
        BinaryGap binaryGap = new BinaryGap();
        assertThat(binaryGap.binaryGap(8), is(0));
        assertThat(binaryGap.binaryGap(22), is(2));
        assertThat(binaryGap.binaryGap(5), is(2));
    }
}