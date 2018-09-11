package org.babyachievement.algorithms.binarytree;

import org.babyachievement.algorithms.structure.TreeNode;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * date: 2018/9/11 17:43
 */
public class PrintBinaryTreeTest {

    @Test
    public void printTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);

        List<List<String>> lists = new PrintBinaryTree().printTree(root);
        for (List<String> list : lists) {
            System.out.println(list);
        }
    }

    @Test
    public void printTree2() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(4);

        List<List<String>> lists = new PrintBinaryTree().printTree(root);
        for (List<String> list : lists) {
            System.out.println(list);
        }
    }
}