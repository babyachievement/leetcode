package com.babyachievement.top100;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * date: 2018/11/5 17:31
 */
public class JumpGameIITest {

    @Test
    public void jump() {
        final JumpGameII jumpGameII = new JumpGameII();
        assertThat(jumpGameII.jump(new int[]{2, 3, 1, 1, 4}), is(2));
        assertThat(jumpGameII.jump(new int[]{7, 0, 9, 6, 9, 6, 1, 7, 9, 0, 1, 2, 9, 0, 3}),
                   is(2));
        assertThat(jumpGameII.jump(new int[]{1}), is(0));
        assertThat(jumpGameII.jump(new int[]{1, 2}), is(1));
        assertThat(jumpGameII.jump(new int[]{1, 2, 3}), is(2));
    }
}