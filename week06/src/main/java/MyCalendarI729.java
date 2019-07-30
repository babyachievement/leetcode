public class MyCalendarI729 {

    public MyCalendarI729() {

    }

    private Node root;

    public boolean book(int start, int end) {
        if (root == null) {
            root = new Node(start, end);
            return true;
        }
        return insert(root, start, end);

    }

    private boolean insert(Node root, int start, int end) {
        if (start >= root.end) {
            if (root.right == null) {
               root.right =  new Node(start, end);
                return true;
            }else {
                return insert(root.right, start, end);
            }
        } else if (end <= root.start) {
            if (root.left == null) {
                root.left = new Node(start, end);
                return true;
            }else {
                return insert(root.left, start, end);
            }
        }
        return false;
    }

    class Node {
        int start;
        int end;
        Node left;
        Node right;
        Node(int s, int e) {
            start=s;
            end=e;
        }
    }
}
