package org.babyachievement.algorithms.binarytree;

import org.babyachievement.algorithms.structure.TreeNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * date: 2018/9/10 10:46
 */
public class ValidateBSTTest {

    ValidateBST validateBST;
    TreeNode root;
    TreeNode root2;
    TreeNode root3;
    @Before
    public void setUp() throws Exception {
        validateBST = new ValidateBST();

        root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);

        root2 = new TreeNode(5);
        root2.left = new TreeNode(1);
        root2.right = new TreeNode(4);
        root2.right.left = new TreeNode(3);
        root2.right.right = new TreeNode(6);

        root3 = new TreeNode(1);
        root3.left = new TreeNode(1);
    }

    @Test
    public void isValidBST() {
        assertTrue(validateBST.isValidBST(root));
        assertFalse(validateBST.isValidBST(root2));
        assertFalse(validateBST.isValidBST(root3));
        assertTrue(validateBST.isValidBST(new TreeNode(Integer.MIN_VALUE)));
    }
}