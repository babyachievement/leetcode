package org.babyachievement.algorithms.binarytree;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * date: 2018/9/7 14:28
 */
public class SearchBSTTest {

    SearchBST bst;
    TreeNode root;
    @Before
    public void setUp() throws Exception {
        bst = new SearchBST();
        root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
    }

    @Test
    public void searchBST() {
        assertEquals(bst.searchBST(root, 2), root.left);
        assertNull(bst.searchBST(root, 6));
    }

    @Test
    public void searchBSTIter() {
        assertEquals(bst.searchBSTIter(root, 2), root.left);
        assertNull(bst.searchBSTIter(root, 6));
    }
}