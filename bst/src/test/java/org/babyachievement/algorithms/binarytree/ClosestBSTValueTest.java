package org.babyachievement.algorithms.binarytree;

import org.babyachievement.algorithms.structure.TreeNode;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * date: 2018/9/7 18:11
 */
public class ClosestBSTValueTest {

    @Test
    public void closestValue() {
        ClosestBSTValue closestBSTValue = new ClosestBSTValue();

        TreeNode treeNode = new TreeNode(1);

        assertThat(closestBSTValue.closestValue(treeNode, 3.7), is(1));
    }
}