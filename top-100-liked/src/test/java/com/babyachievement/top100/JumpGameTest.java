package com.babyachievement.top100;

import org.junit.Test;

import static org.junit.Assert.*;

<<<<<<< HEAD
=======
/**
 * date: 2018/9/18 10:15
 */
>>>>>>> d0af98dc192d0d1727c1ba8a6d9dae16c60b299e
public class JumpGameTest {

    @Test
    public void canJump() {
        JumpGame jumpGame = new JumpGame();
        assertTrue(jumpGame.canJump(new int[]{2, 3, 1, 1, 4}));
<<<<<<< HEAD
=======
        assertTrue(jumpGame.canJump(new int[]{2}));
>>>>>>> d0af98dc192d0d1727c1ba8a6d9dae16c60b299e
        assertFalse(jumpGame.canJump(new int[]{3,2,1,0,4}));
    }
}