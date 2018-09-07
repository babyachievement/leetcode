package org.babyachievement.algorithms.binarytree;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * date: 2018/9/5 14:44
 */
public class UniqueBSTTest {

    @Test
    public void numTrees() {
        assertEquals(5, new UniqueBST().numTrees(3));
    }

    @Test
    public void numTreesWithoutRecursion() {
        assertEquals(5, new UniqueBST().numTreesWithoutRecursion(3));
    }
}