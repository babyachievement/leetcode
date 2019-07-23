import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * date: 2019/7/22 10:49
 */

public class NextGreaterElementI496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();

        Stack<Integer> stack = new Stack<>();


        for (int num : nums2) {
            while (!stack.isEmpty() && stack.peek() < num)
                map.put(stack.pop(), num);
            stack.push(num);
        }

        for (int i = 0; i < nums1.length; i++) {

            nums1[i] = map.getOrDefault(nums1[i], -1);
        }

        return nums1;
    }
}
