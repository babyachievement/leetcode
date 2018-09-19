package com.babyachievement.top100;

import org.junit.Test;

import static org.junit.Assert.*;

public class JumpGameTest {

    @Test
    public void canJump() {
        JumpGame jumpGame = new JumpGame();
        assertTrue(jumpGame.canJump(new int[]{2, 3, 1, 1, 4}));
        assertFalse(jumpGame.canJump(new int[]{3,2,1,0,4}));
    }
}