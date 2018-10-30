/**
 * date: 2018/10/30 11:42
 */

package com.babyachievement.top.interviews;

import org.babyachievement.algorithms.structure.RandomListNode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/copy-list-with-random-pointer/description/
 */
public class CopyListWithRandomPointer138 {
    public RandomListNode copyRandomList(RandomListNode head) {
        if (head == null) {
            return null;
        }


        Map<RandomListNode, Integer> listNodeIntegerMap = new HashMap<>();
        int                          i                  = 0;
        RandomListNode               current            = head;
        while (current != null) {
            listNodeIntegerMap.put(current, i++);
            current = current.next;
        }


        RandomListNode[] randomListNodes = new RandomListNode[i];

        current = head;
        RandomListNode pre = null;
        i = 0;
        while (current != null) {
            randomListNodes[i] = new RandomListNode(current.label);
            if (null != pre) {
                pre.next = randomListNodes[i];
            }
            pre = randomListNodes[i];
            i++;
            current = current.next;
        }


        current = head;
        RandomListNode newCurrent = randomListNodes[0];
        while (current != null) {

            if (null != current.random) {
                newCurrent.random = randomListNodes[listNodeIntegerMap.get
                        (current.random).intValue()];
            }

            current = current.next;
            newCurrent = newCurrent.next;
        }

        return randomListNodes[0];
    }

    public RandomListNode copyRandomList2(RandomListNode head) {
        RandomListNode p = head;
        /**
         * insert a copy of each node after origin node
         */
        while (p != null) {
            final RandomListNode node = new RandomListNode(p.label);
            node.next = p.next;
            p.next = node;
            p = node.next;
        }

        /**
         * set random pointer of each copied node
         */
        p = head;
        while (p != null && p.next != null) {
            if (p.random != null) {
                p.next.random = p.random.next;
            }
            p = p.next.next;
        }

        /**
         * recover origin list
         */
        RandomListNode newHead = new RandomListNode(0);
        RandomListNode newP = newHead;
        p = head;
        while (p != null) {
            newP.next = p.next;
            p.next = newP.next.next;

            newP = newP.next;
            p = p.next;
        }

        return newHead.next;
    }
}
