package com.babyachievement.top100;

import org.babyachievement.algorithms.structure.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * date: 2018/9/28 14:38
 */
public class ConvertBSTToGreaterTree538Test {

    @Test
    public void convertBST() {
        final TreeNode treeNode = new TreeNode(5);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(7);
        treeNode.right.left = new TreeNode(6);
        treeNode.right.right = new TreeNode(8);

        final ConvertBSTToGreaterTree538 bstToGreaterTree538 = new ConvertBSTToGreaterTree538();
        final TreeNode                   node           = bstToGreaterTree538
                .convertBST(treeNode);
        System.out.println(node.val);
    }
}