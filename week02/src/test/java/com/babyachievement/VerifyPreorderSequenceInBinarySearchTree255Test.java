package com.babyachievement;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * date: 2018/11/15 18:00
 */
public class VerifyPreorderSequenceInBinarySearchTree255Test {

    @Test
    public void verifyPreorder() {
        final VerifyPreorderSequenceInBinarySearchTree255 binarySearchTree255 = new VerifyPreorderSequenceInBinarySearchTree255();
//        assertTrue(binarySearchTree255.verifyPreorder(new int[]{4,2,1,3,6,5, 7}));
//        assertFalse(binarySearchTree255.verifyPreorder(new int[]{4,2,8,3,6,5, 7}));
//        assertFalse(binarySearchTree255.verifyPreorder(new int[]{10,7,4,8,6,40,23}));
        int[] num = new int[8000];
        for (int i = 1; i <=8000; i++) {
            num[i-1] = i;
        }
        assertTrue(binarySearchTree255.verifyPreorder(num));
    }
}