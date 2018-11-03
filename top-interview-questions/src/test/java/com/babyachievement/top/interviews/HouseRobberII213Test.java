package com.babyachievement.top.interviews;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class HouseRobberII213Test {

    @Test
    public void rob() {
        HouseRobberII213 robberII213 = new HouseRobberII213();
        assertThat(robberII213.rob(new int[]{2,3,2}), is(3));
        assertThat(robberII213.rob(new int[]{1,2,3,1}), is(4));
    }
}