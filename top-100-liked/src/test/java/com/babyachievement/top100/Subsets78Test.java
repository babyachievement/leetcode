package com.babyachievement.top100;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * date: 2018/10/8 15:06
 */
public class Subsets78Test {

    @Test
    public void subsets() {
        final Subsets78 subsets78 = new Subsets78();
        final List<List<Integer>> subsets = subsets78.subsets(new int[]{1, 2,
                3, 4});
        System.out.println(subsets);
    }
}