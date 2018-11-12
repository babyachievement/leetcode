package com.babyachievement;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * date: 2018/11/8 10:19
 */
public class SubsetsII90Test {

    @Test
    public void subsetsWithDup() {
        final SubsetsII90 subsetsII90 = new SubsetsII90();
        System.out.println(subsetsII90.subsetsWithDup(new int[]{1, 2, 2}));
        System.out.println(subsetsII90.subsetsWithDup(new int[]{1, 2, 2, 2}));
        System.out.println(subsetsII90.subsetsWithDup(new int[]{1, 2, 2, 2, 2}));
        System.out.println(subsetsII90.subsetsWithDup(new int[]{1, 1, 2, 2}));
    }
}