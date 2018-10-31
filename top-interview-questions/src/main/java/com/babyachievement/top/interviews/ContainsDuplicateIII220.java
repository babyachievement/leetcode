/**
 * date: 2018/10/31 9:42
 */

package com.babyachievement.top.interviews;

import java.util.TreeSet;

/**
 * https://leetcode.com/problems/contains-duplicate-iii/description/
 */
public class ContainsDuplicateIII220 {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        return bst(nums, k, t);
    }

    boolean bst(int[] nums, int k, int t) {
        TreeSet<Integer> window = new TreeSet<>();

        for (int i = 0; i < nums.length; i++) {

            final Integer ceil = window.ceiling(Integer.valueOf(nums[i]));

            if (ceil != null && Long.valueOf(ceil.intValue()) - Long.valueOf
                    (nums[i]) <= t) {
                return true;
            }

            final Integer floor = window.floor(Integer.valueOf(nums[i]));

            if (floor != null && Long.valueOf(nums[i]) - Long.valueOf
                    (floor.intValue()) <= t) {
                return true;
            }


            window.add(nums[i]);

            if (i - k >= 0) {
                window.remove(nums[i - k]);
            }

        }

        return false;
    }

    boolean bruteForce(int[] nums, int k, int t) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j <= k; j++) {
                if (i - j < 0) {
                    break;
                }

                final long diff = Math.abs(nums[i] + 0L - nums[i - j]);
                if (diff >= 0 && diff <= t) {
                    return true;
                }
            }
        }


        return false;
    }


    public boolean containsNearbyAlmostDuplicate2(int[] nums, int k, long t) {
        if (nums.length > 100 || k == 0) return false;
        TreeNode root = null;
        for (int i = 0; i < nums.length; i++) {
            if (find(root, nums[i] - t, nums[i] + t, i, k)) return true;
            root = insert(root, nums[i], i);
        }
        return false;
    }

    private TreeNode insert(TreeNode root, int val, int index) {
        if (root == null) return new TreeNode(val, index);
        if (root.val > val) root.left = insert(root.left, val, index);
        else root.right = insert(root.right, val, index);
        return root;
    }

    private boolean find(TreeNode root, long min, long max, long index, long indexDiff) {
        if (root == null || min > max) return false;
        if (root.val <= max && root.val >= min && Math.abs(root.index - index) <= indexDiff) return true;
        if (root.val > min) {
            if (find(root.left, min, max, index, indexDiff)) {
                return true;
            }
        }
        if (root.val < max) return find(root.right, min, max, index, indexDiff);
        return false;
    }

    private static class TreeNode {
        long val, index;
        TreeNode left, right;

        TreeNode(long val, long index) {
            this.val = val;
            this.index = index;
        }
    }

    public static void main(String[] args) {
        System.out.println(1 - Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE - (1 + Integer.MIN_VALUE));
        System.out.println((1 + Integer.MIN_VALUE) - Integer.MAX_VALUE);

        final TreeSet<Integer> integers = new TreeSet<>();
        integers.add(Integer.valueOf(1));
        integers.add(Integer.valueOf(1));
        System.out.println(integers.size());
        integers.remove(Integer.valueOf(1));
        System.out.println(integers.size());
    }
}
