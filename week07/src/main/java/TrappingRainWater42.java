import java.util.Stack;

/**
 * date: 2019/8/1 13:54
 */

public class TrappingRainWater42 {
    public int trap(int[] height) {
        // 单调递减
        Stack<Integer> stack = new Stack<>();


        int total            = 0;
        int currentMaxHeight = 0;


        for (int i = 0; i < height.length; i++) {

            int width = 0;
            while (!stack.isEmpty() && height[i] >= currentMaxHeight) {
                final Integer pop = stack.pop();
                width = i - pop - 1;

                if (stack.size() > 0) {
                    total -= height[pop];
                }
            }


            total += currentMaxHeight * width;
            currentMaxHeight = Math.max(height[i], currentMaxHeight);


            stack.push(i);
        }


        int preIndex = !stack.isEmpty() ? stack.pop() : -1;
        int max      = preIndex == -1 ? 0 : height[preIndex];

        int sub = 0;
        while (!stack.isEmpty()) {
            final Integer pop = stack.pop();
            if (height[pop] >= max) {
                total += (preIndex - pop - 1) * max - sub;
                max = height[pop];
                preIndex = pop;
                sub = 0;
            } else {
                sub += height[pop];
            }
        }


        return total;
    }

    public int trap2(int[] height) {
        int left = 0, right = height.length - 1;

        int leftMax = 0, rightMax = 0;

        int total = 0;
        while (left < right) {
            if (height[left] <= height[right]) {
                if (height[left] < leftMax) {
                    total += leftMax - height[left];
                }else {
                    leftMax = height[left];
                }
                left++;
            } else {

                if (height[right] < rightMax) {
                    total += rightMax - height[right];
                }else {
                    rightMax = height[right];
                }
                right--;
            }
        }

        return total;
    }

    public static void main(String[] args) {
        final TrappingRainWater42 trappingRainWater42 = new TrappingRainWater42();
        final int trap = trappingRainWater42.trap(
                new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1});
        final int trap2 = trappingRainWater42.trap(
                new int[]{2, 1, 0, 2});
        System.out.println(trap);
        System.out.println(trap2);
    }
}
