/**
 * date: 2019/7/22 10:55
 */

public class MyCircularDeque641 {
    public static class DequeNode{
        DequeNode next;
        DequeNode pre;
        int       value;
    }

    private int       capacity;
    private int       size;
    private DequeNode head;
    /** Initialize your data structure here. Set the size of the deque to be k. */
    public MyCircularDeque641(int k) {
        this.capacity = k;
        this.head = new DequeNode();
    }

    /** Adds an item at the front of Deque. Return true if the operation is successful. */
    public boolean insertFront(int value) {
        if (isFull()) {
            return false;
        }
        final DequeNode dequeNode = new DequeNode();
        dequeNode.value = value;
        if (!isEmpty()) {
            this.head.next.pre = dequeNode;
            dequeNode.next = this.head.next;
            dequeNode.pre = this.head;
            this.head.next = dequeNode;
        }else{
            this.head.next = dequeNode;
            dequeNode.next = this.head;
            dequeNode.pre = this.head;
            this.head.pre = dequeNode;
        }

        this.size++;
        return true;
    }

    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    public boolean insertLast(int value) {
        if (isFull()) {
            return false;
        }
        final DequeNode dequeNode = new DequeNode();
        dequeNode.value = value;
        if (!isEmpty()) {
            this.head.pre.next = dequeNode;
            dequeNode.next = this.head;
            dequeNode.pre = this.head.pre;
            this.head.pre = dequeNode;
        }else{
            this.head.next = dequeNode;
            dequeNode.next = this.head;
            dequeNode.pre = this.head;
            this.head.pre = dequeNode;
        }

        this.size++;
        return true;
    }

    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
    public boolean deleteFront() {
        if (isEmpty()) {
            return false;
        }

        head.next.next.pre = head;
        head.next = head.next.next;
        this.size--;
        return true;

    }

    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
    public boolean deleteLast() {
        if (isEmpty()) {
            return false;
        }

        head.pre.pre.next = head;
        head.pre = head.pre.pre;
        this.size--;
        return true;
    }

    /** Get the front item from the deque. */
    public int getFront() {
        if (isEmpty()) {
            return -1;
        }
        return head.next.value;
    }

    /** Get the last item from the deque. */
    public int getRear() {
        if (isEmpty()) {
            return -1;
        }
        return head.pre.value;
    }

    /** Checks whether the circular deque is empty or not. */
    public boolean isEmpty() {
       return this.size == 0;
    }

    /** Checks whether the circular deque is full or not. */
    public boolean isFull() {
        return this.size == this.capacity;
    }


}
