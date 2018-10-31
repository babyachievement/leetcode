package com.babyachievement.top100;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * https://leetcode.com/problems/insert-delete-getrandom-o1/description/
 */
public class InsertDeleteGetRandom380 {
    static class DoubleLinkListNode {
        int value;
        int index;
        DoubleLinkListNode pre;
        DoubleLinkListNode next;
    }

    Map<Integer, DoubleLinkListNode> valueNodeMap = new HashMap<>();
    Map<Integer, DoubleLinkListNode> indexNodeMap = new HashMap<>();
    DoubleLinkListNode head = new DoubleLinkListNode();
    Random random = new Random();
    int size = 0;

    /**
     * Initialize your data structure here.
     */
    public InsertDeleteGetRandom380() {
        head.pre = head;
        head.next = head;
    }

    /**
     * Inserts a value to the set. Returns true if the set did not already contain the specified element.
     */
    public boolean insert(int val) {
        if (valueNodeMap.containsKey(val)) {
            return false;
        }


        size++;
        DoubleLinkListNode node = new DoubleLinkListNode();
        node.value = val;
        node.index = size - 1;

        head.next.pre = node;
        node.next = head.next;
        node.pre = head;
        head.next = node;

        indexNodeMap.put(size-1, node);
        valueNodeMap.put(val, node);

        return true;
    }

    /**
     * Removes a value from the set. Returns true if the set contained the specified element.
     */
    public boolean remove(int val) {
        if (!valueNodeMap.containsKey(val)) return false;

        DoubleLinkListNode node = valueNodeMap.remove(val);
        node.next.pre = node.pre;
        node.pre.next = node.next;

        if (node.index == size - 1) {
            indexNodeMap.remove(size - 1);

        }else {
            DoubleLinkListNode lastNode = indexNodeMap.remove(size - 1);
            lastNode.index = node.index;
            indexNodeMap.put(node.index, lastNode);
        }

        size = size - 1;

        return true;
    }

    /**
     * Get a random element from the set.
     */
    public int getRandom() {
        return indexNodeMap.get(Math.abs(random.nextInt(size))).value;
    }
}
