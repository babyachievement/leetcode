/**
 * date: 2019/7/29 13:53
 */

public class DesignLinkedList707 {
    Node head;
    int  size;

    /**
     * Initialize your data structure here.
     */
    public DesignLinkedList707() {
        head = new Node();
    }

    /**
     * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
     */
    public int get(int index) {
        if (size <= index|| index<0) return -1;

        int  i       = 0;
        Node current = head.next;
        while (current != null && i < index) {
            current = current.next;
            i++;
        }

        return current.val;
    }

    /**
     * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
     */
    public void addAtHead(int val) {
        final Node next = new Node();
        next.val = val;
        next.next = head.next;
        head.next = next;

        size++;
    }

    /**
     * Append a node of value val to the last element of the linked list.
     */
    public void addAtTail(int val) {
        final Node next = new Node();
        next.val = val;


        Node pre     = head;
        Node current = head.next;
        while (current != null) {
            pre = current;
            current = current.next;
        }

        pre.next = next;


        size++;
    }

    /**
     * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
     */
    public void addAtIndex(int index, int val) {
        if (index > size|| index<0) {
            return;
        }

        if (index == size) {
            addAtTail(val);
            return;
        }


        int i = 0;

        Node current = head;
        while (current != null && i < index) {
            current = current.next;
            i++;
        }

        final Node node = new Node();
        node.val = val;
        node.next = current.next;
        current.next = node;
        size++;
    }

    /**
     * Delete the index-th node in the linked list, if the index is valid.
     */
    public void deleteAtIndex(int index) {
        if (index > size|| index<0) {
            return;
        }


        int i = 0;

        Node current = head;
        while (current != null && i < index) {
            current = current.next;
            i++;
        }

        Node d = current.next;
        current.next = d.next;
        size--;
    }

    class Node {
        int  val;
        Node next;
    }

    public static void main(String[] args) {
        final DesignLinkedList707 designLinkedList707 = new DesignLinkedList707();
        designLinkedList707.addAtHead(1);
        designLinkedList707.addAtTail(3);
        designLinkedList707.addAtIndex(1, 2);
        System.out.println(designLinkedList707.get(1));
        designLinkedList707.deleteAtIndex(1);
        System.out.println(designLinkedList707.get(1));

        final DesignLinkedList707 designLinkedList7071 = new DesignLinkedList707();
        designLinkedList7071.addAtHead(1);
        designLinkedList7071.addAtIndex(1, 2);
        System.out.println(designLinkedList7071.get(0));
        System.out.println(designLinkedList7071.get(1));
        System.out.println(designLinkedList7071.get(2));

        final DesignLinkedList707 designLinkedList7072 = new DesignLinkedList707();
        designLinkedList7072.addAtHead(5);
        designLinkedList7072.addAtHead(2);
        designLinkedList7072.deleteAtIndex(1);
        designLinkedList7072.addAtIndex(1,9);
        designLinkedList7072.addAtHead(4);
        designLinkedList7072.addAtHead(9);
        designLinkedList7072.addAtHead(8);
        System.out.println(designLinkedList7072.get(3));
        designLinkedList7072.addAtTail(1);
        designLinkedList7072.addAtIndex(3,6);
        designLinkedList7072.addAtHead(3);

        final DesignLinkedList707 designLinkedList7073 = new DesignLinkedList707();
        designLinkedList7073.addAtHead(1);
        designLinkedList7073.addAtTail(3);
        designLinkedList7073.addAtIndex(1, 2);

    }
}
