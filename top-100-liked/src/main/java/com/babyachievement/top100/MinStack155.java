/**
 * date: 2018/9/19 17:45
 */

package com.babyachievement.top100;

/**
 * https://leetcode.com/problems/min-stack/description/
 */
public class MinStack155 {
    static class StackNode {
        int       val;
        StackNode next;
        int currentMin;
    }

    StackNode head;

    public MinStack155() {
        head = new StackNode();
    }

    public void push(int x) {
        final StackNode next      = head.next;
        final StackNode stackNode = new StackNode();
        stackNode.val = x;
        if (next != null && x > next.currentMin) {
            stackNode.currentMin = next.currentMin;
        } else {
            stackNode.currentMin = x;
        }

        stackNode.next = next;
        head.next = stackNode;
    }

    public void pop() {
        if (head.next != null)
            head.next = head.next.next;
    }

    public int top() {
        return head.next.val;
    }

    public int getMin() {
        return head.next.currentMin;
    }
}
