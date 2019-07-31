import java.util.Stack;

/**
 * date: 2019/7/31 11:18
 */

public class Leet132Pattern456 {
    public boolean find132pattern(int[] nums) {
        if (nums.length < 3) {
            return false;
        }
        int[] stack = new int[nums.length + 1];
        int   idx   = 0;

        int[] mins = new int[nums.length];
        mins[0] = -1;

        for (int i = 0; i < nums.length; i++) {

            if (i != 0) {
                if (i == 1 || nums[i - 1] < nums[mins[i - 1]]) {
                    mins[i] = i - 1;
                } else {
                    mins[i] = mins[i - 1];
                }
            }

            while (idx != 0 && nums[stack[idx]] <= nums[i]) {
                idx--;
            }

            if (idx != 0 && mins[stack[idx]] != -1) {
                int min = nums[mins[stack[idx]]];
                if (min < nums[i]) {
                    return true;
                }
            }
            stack[++idx] = i;
        }

        return false;
    }

    public boolean find132pattern2(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int            third = Integer.MIN_VALUE;

        /**
         * 这里使用一个单调递减栈，
         * 栈里存放的都是可以维持坐标 second > third 的 second 值,
         * 如果有更大的值进来，那就等于形成了一个更优的 second > third 的这样一个组合，
         * 并且这时弹出的 third 值比以前的 third 值更大，为什么要保证 third 值更大，
         * 因为这样才可以更容易的满足当前的值 first 比 third 值小这个条件
         */
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < third) return true;

            while (!stack.isEmpty() && nums[i] > stack.peek()) {
                third = stack.pop();
            }

            stack.push(nums[i]);
        }

        return false;
    }

    public static void main(String[] args) {
        final Leet132Pattern456 leet132Pattern456 = new Leet132Pattern456();
        leet132Pattern456.find132pattern2(new int[]{8, 10, 4, 6, 5});
        leet132Pattern456.find132pattern2(new int[]{1, 2, 3, 4});
        leet132Pattern456.find132pattern2(new int[]{-1, 3, 2, 0});
    }
}
