package com.babyachievement.top.interviews;

import org.babyachievement.algorithms.structure.TreeLinkNode;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * date: 2018/10/25 10:25
 */
public class PopulatingNextRightPointers116Test {

    @Test
    public void connect() {
        final TreeLinkNode root = new TreeLinkNode(1);
        root.left = new TreeLinkNode(2);
        root.right = new TreeLinkNode(3);

        root.left.left = new TreeLinkNode(4);
        root.left.right = new TreeLinkNode(5);
        root.right.left = new TreeLinkNode(6);
        root.right.right = new TreeLinkNode(7);

        final PopulatingNextRightPointers116 rightPointers116 = new PopulatingNextRightPointers116();
        rightPointers116.connect(root);
        assertNull(root.next);
        assertThat(root.left.next, is(root.right));
        assertThat(root.left.right.next, is(root.right.left));
    }
}