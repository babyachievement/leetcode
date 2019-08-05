import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * date: 2019/8/5 10:01
 */

public class CountOfSmallerNumbersAfterSelf315 {
    class Node {
        int val, leftSum = 0, count = 0;
        Node left, right;

        public Node(int val) {
            this.val = val;
        }
    }

    public List<Integer> countSmaller(int[] nums) {
        Integer[] count = new Integer[nums.length];
        if (nums.length == 0) {
            return Arrays.asList(count);
        }
        Node root = new Node(nums[nums.length - 1]);
        for (int i = nums.length - 1; i >= 0; i--) {
            count[i] = insert(root, nums[i]);
        }
        return Arrays.asList(count);
    }

    private int insert(Node node, int num) {
        int sum = 0;
        while (node.val != num) {
            if (node.val > num) {
                if (node.left == null) node.left = new Node(num);
                node.leftSum++;
                node = node.left;
            } else {
                sum += node.leftSum + node.count;
                if (node.right == null) node.right = new Node(num);
                node = node.right;
            }
        }
        node.count++;
        return sum + node.leftSum;
    }

    public List<Integer> countSmaller2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return Collections.emptyList();
        }
        Integer[] count = new Integer[nums.length];


        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();


        for (int i = nums.length - 1; i >= 0; i--) {
            while (!stack1.isEmpty() && nums[i] <= stack1.peek()) {
                stack2.push(stack1.pop());
            }

            count[i] = stack1.size();
            stack1.push(nums[i]);

            while (!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            }
        }


        return Arrays.asList(count);


    }

    public static void main(String[] args) {
        final CountOfSmallerNumbersAfterSelf315 countOfSmallerNumbersAfterSelf315 = new CountOfSmallerNumbersAfterSelf315();
        countOfSmallerNumbersAfterSelf315.countSmaller2(new int[]{5, 2, 6, 1});
    }


    public List<Integer> countSmaller1(int[] nums) {
        if (nums == null || nums.length == 0) {
            return Collections.emptyList();
        }
        Integer[] count = new Integer[nums.length];
        Arrays.fill(count, 0);
        for (int i = nums.length - 2; i >= 0; i--) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    count[i]++;
                }
            }
        }


        return Arrays.asList(count);
    }
}
