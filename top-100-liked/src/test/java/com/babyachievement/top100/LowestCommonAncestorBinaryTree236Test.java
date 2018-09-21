package com.babyachievement.top100;

import org.babyachievement.algorithms.structure.TreeNode;
import org.babyachievement.algorithms.structure.utils.BSTUtils;
import org.hamcrest.MatcherAssert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;

/**
 * date: 2018/9/21 14:29
 */
public class LowestCommonAncestorBinaryTree236Test {

    @Test
    public void lowestCommonAncestor() {
        final LowestCommonAncestorBinaryTree236 lowestCommonAncestor = new LowestCommonAncestorBinaryTree236();
        List<Integer>                           list                              = new ArrayList<>();
        final TreeNode treeNode = BSTUtils.listToTree(Arrays.asList(3,
                                                                    5,
                                                                    1,
                                                                    6,
                                                                    2,
                                                                    0,
                                                                    8,
                                                                    null,
                                                                    null,
                                                                    7,
                                                                    4));

        MatcherAssert.assertThat(lowestCommonAncestor.lowestCommonAncestor(treeNode, new
                TreeNode(5), new TreeNode(1)).val, is(3));
    }
}