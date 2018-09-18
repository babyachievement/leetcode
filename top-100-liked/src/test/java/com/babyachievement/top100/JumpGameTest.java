package com.babyachievement.top100;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * date: 2018/9/18 10:15
 */
public class JumpGameTest {

    @Test
    public void canJump() {
        JumpGame jumpGame = new JumpGame();
        assertTrue(jumpGame.canJump(new int[]{2, 3, 1, 1, 4}));
        assertTrue(jumpGame.canJump(new int[]{2}));
        assertFalse(jumpGame.canJump(new int[]{3,2,1,0,4}));
    }
}