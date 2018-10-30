package com.babyachievement.top.interviews;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * date: 2018/10/30 11:12
 */
public class GasStation134Test {

    @Test
    public void canCompleteCircuit() {
        final GasStation134 gasStation134 = new GasStation134();
        assertThat(gasStation134.canCompleteCircuit(new int[]{1,2,3,4,5}, new
        int[]{3,4,5,1,2}), is(3));
        assertThat(gasStation134.canCompleteCircuit(new int[]{2,3,4}, new
                int[]{3,4,3}), is(-1));
    }
}