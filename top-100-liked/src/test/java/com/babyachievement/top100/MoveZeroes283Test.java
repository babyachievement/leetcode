package com.babyachievement.top100;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * date: 2018/9/25 18:20
 */
public class MoveZeroes283Test {

    @Test
    public void moveZeroes() {
        final MoveZeroes283 moveZeroes = new MoveZeroes283();
        final int[]         nums       = {0, 1, 0, 3, 12};
        moveZeroes.moveZeroes(nums);
        assertArrayEquals(new int[]{1, 3, 12, 0, 0}, nums);
    }
}