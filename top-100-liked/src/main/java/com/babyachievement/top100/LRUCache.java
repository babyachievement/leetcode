/**
 * date: 2018/9/19 13:41
 */

package com.babyachievement.top100;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/lru-cache/description/
 */
public class LRUCache {
    private int capacity;

    static class DoubleListNode {
        int            key;
        int            value;
        DoubleListNode pre;
        DoubleListNode next;
    }

    private final DoubleListNode               head;
    private       int                          count;
    private final Map<Integer, DoubleListNode> storage;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        head = new DoubleListNode();
        head.next = head;
        head.pre = head;
        storage = new HashMap<>();
        count = 0;
    }

    public int get(int key) {
        if (storage.containsKey(key)) {
            final DoubleListNode doubleListNode = storage.get(key);
            updateLRU(doubleListNode);
            return doubleListNode.value;
        } else {
            return -1;
        }
    }

    public void put(int key, int value) {
        if (storage.containsKey(key)) {
            final DoubleListNode node = storage.get(key);
            node.value = value;
            updateLRU(node);
        } else {
            if (count == capacity) {
                evictNode();
            }

            final DoubleListNode doubleListNode = new DoubleListNode();
            doubleListNode.key = key;
            doubleListNode.value = value;
            updateLRU(doubleListNode);
            storage.put(key, doubleListNode);
            count++;
        }

    }

    private void updateLRU(DoubleListNode node) {
        final DoubleListNode pre  = node.pre;
        final DoubleListNode next = node.next;

        if (pre != null && next != null) {
            pre.next = next;
            next.pre = pre;
        }

        node.next = head.next;
        node.pre = head;
        head.next.pre = node;
        head.next = node;
    }

    private void evictNode() {

        final DoubleListNode last = head.pre;
        final DoubleListNode pre  = last.pre;
        pre.next = head;
        head.pre = pre;

        storage.remove(last.key);
        count--;
    }
}
