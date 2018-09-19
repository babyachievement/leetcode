package org.babyachievement.algorithms.binarytree;

import org.babyachievement.algorithms.structure.TreeNode;
import org.babyachievement.algorithms.structure.utils.BSTUtils;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertTrue;

/**
 * date: 2018/9/6 10:21
 */
public class UniqueBSTIITest {

    @Test
    public void generateTrees() {
        UniqueBSTII uniqueBSTII = new UniqueBSTII();
        List<TreeNode> treeNodeList = uniqueBSTII.generateTrees(3);

        assertThat(treeNodeList.size(), is(5));

        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);

        assertTrue(BSTUtils.contains(root, treeNodeList));

        assertTrue(uniqueBSTII.generateTrees(0).isEmpty());
    }

    @Test
    public void generateTrees2() {
        UniqueBSTII uniqueBSTII = new UniqueBSTII();
        List<TreeNode> treeNodeList = uniqueBSTII.generateTrees2(3);

        assertThat(treeNodeList.size(), is(5));

        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);

        assertTrue(BSTUtils.contains(root, treeNodeList));

        assertTrue(uniqueBSTII.generateTrees2(0).isEmpty());
    }
}