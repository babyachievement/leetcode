package org.babyachievement.algorithms.binarytree;

import org.babyachievement.algorithms.structure.TreeNode;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * date: 2018/9/6 10:25
 */
public class BSTUtilsTest {

    @Test
    public void compareBSTS() {
        assertTrue(BSTUtils.compareBSTS(null, null));
        assertFalse(BSTUtils.compareBSTS(new TreeNode(1), null));
        assertFalse(BSTUtils.compareBSTS(null, new TreeNode(1)));
        assertTrue(BSTUtils.compareBSTS(new TreeNode(1), new TreeNode(1)));

        TreeNode one = new TreeNode(1);
        one.left = new TreeNode(2);

        TreeNode another = new TreeNode(1);
        another.left = new TreeNode(2);

        assertTrue(BSTUtils.compareBSTS(one, another));

        TreeNode one2 = new TreeNode(1);
        one2.left = new TreeNode(3);

        TreeNode another2 = new TreeNode(1);
        another2.left = new TreeNode(2);

        assertFalse(BSTUtils.compareBSTS(one2, another2));
    }

    @Test
    public void contains() {
        assertFalse(BSTUtils.contains(null, new ArrayList<>()));
        assertFalse(BSTUtils.contains(new TreeNode(1), null));
        assertTrue(BSTUtils.contains(new TreeNode(1),
                                      Arrays.asList(new TreeNode(2), new TreeNode(1))));

    }
}