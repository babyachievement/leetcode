package org.babyachievement.algorithms.binarytree;

/**
 * https://leetcode.com/problems/binary-gap/description/
 */
public class BinaryGap {
    public int binaryGap(int N) {
        int max = 0;

        int i = 0;
        int pre = 0;

        int temp = N;
        while (temp != 0) {
            i++;
            if((temp & 1) > 0) {
                if (pre > 0 && (i-pre)>max) {
                    max = i - pre;
                }
                pre = i;
            }
            temp = temp >> 1;

        }

        return max;
    }
}
