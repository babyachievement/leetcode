package com.babyachievement;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class Three3SumClosest16Test {

    @Test
    public void threeSumClosest() {
        Three3SumClosest16 sumClosest16 = new Three3SumClosest16();
        assertThat(sumClosest16.threeSumClosest(new int[]{-1, 2, 1, 4}, 1), is(2));
        assertThat(sumClosest16.threeSumClosest(new int[]{1,0,-1,0,-2,2,21,-15}, -20), is(-18));
        assertThat(sumClosest16.threeSumClosest(new int[]{1,0,-1,-1,-1,-1,0,1,1,1,2}, -20), is(-3));
        assertThat(sumClosest16.threeSumClosest(new int[]{1,2,33,23,2423,33,23,1,7,6,8787,5,33,2,3,-23,-54,-67,100,400,-407,-500,-35,-8,0,0,7,6,0,1,2,-56,-89,24,2}, 148), is(147));
    }
}