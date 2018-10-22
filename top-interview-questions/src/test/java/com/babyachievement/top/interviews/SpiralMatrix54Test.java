package com.babyachievement.top.interviews;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * date: 2018/10/22 14:58
 */
public class SpiralMatrix54Test {

    @Test
    public void spiralOrder() {
        final SpiralMatrix54 spiralMatrix54 = new SpiralMatrix54();
        System.out.println(spiralMatrix54.spiralOrder(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}}));
        System.out.println(spiralMatrix54.spiralOrder(new int[][]{{1,2,3,4},
                {5,6,7,8},{9,10,11,12},{13,14,15,16}}));
    }
}