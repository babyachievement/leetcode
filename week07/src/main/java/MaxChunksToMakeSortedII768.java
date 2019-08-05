import java.util.Arrays;
import java.util.Stack;

/**
 * date: 2019/8/2 14:23
 * 这道题是之前那道 Max Chunks To Make Sorted 的拓展，那道题说了数组是[0, n-1]中所有数字的一种全排列，n为数组的长度。
 * 而这道题的数字就没有这种限制，可以是大于n的数字，也可以有重复的数字。由于数字和坐标不再有太多的关联，
 * 所以之前那题中比较数字和坐标的大小的解法肯定行不通了
 */
public class MaxChunksToMakeSortedII768 {
    public int maxChunksToSorted(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        final int[] sorts = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sorts[i] = arr[i];
        }

        Arrays.sort(sorts);


        long sum1  = 0;
        long sum2  = 0;
        int  count = 0;
        for (int i = 0; i < arr.length; i++) {
            sum1 += arr[i];
            sum2 += sorts[i];

            if (sum1 == sum2) {
                count++;
                sum1 = sum2 = 0;
            }
        }

        return count;
    }


    /**
     * 我们需要两个数组forward和backward，其中 foward[i] 表示 [0, i] 范围内最大的数字，而 backward[i] 表示 [i, n-1] 范围内最小的数字，
     * 实际上就是要知道已经遍历过的最大值，和还未遍历的到的最小值。为啥我们对这两个值感兴趣呢？这是本解法的精髓所在，
     * 我们知道可以拆分为块儿的前提是之后的数字不能比当前块儿中的任何数字小，不然那个较小的数字就无法排到前面
     *
     * @param arr
     * @return
     */
    public int maxChunksToSorted2(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        final int[] forword  = new int[arr.length];
        final int[] backword = new int[arr.length];

        forword[0] = arr[0];
        backword[arr.length - 1] = arr[arr.length - 1];
        for (int i = 1; i < arr.length; i++) {
            forword[i] = Math.max(forword[i - 1], arr[i]);
        }

        for (int i = arr.length - 2; i >= 0; i--) {
            backword[i] = Math.min(backword[i + 1], arr[i]);
        }

        int count = 1;
        int max   = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            max = Math.max(max, arr[i]);
            if (max <= backword[i + 1]) {
                count++;
            }
        }

        return count;
    }


    /**
     * 优化2
     * 对于forward我们只需要一个值去保存当前遇到的最大值即可
     *
     * @param arr
     * @return
     */
    public int maxChunksToSorted3(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        final int[] backword = new int[arr.length];

        backword[arr.length - 1] = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            backword[i] = Math.min(backword[i + 1], arr[i]);
        }

        int count = 1;
        int max   = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            max = Math.max(max, arr[i]);
            if (max <= backword[i + 1]) {
                count++;
            }
        }

        return count;
    }

    public int maxChunksToSorted4(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        // 使用一个单调递增栈，当前数据比栈顶元素小的数据时，取出栈顶元素，然后将栈中所有大于当前数据的栈内值弹出
        // 然后再把之前的最大值push到栈中，最后栈的大小即为最大可分块
        Stack<Integer> stack = new Stack<>();

        int currentMax;
        for (int i : arr) {
            if (stack.isEmpty() || stack.peek() <= i) {
                stack.push(i);
            }else {
                currentMax = stack.pop();
                while (!stack.isEmpty() && stack.peek() > i) {
                    stack.pop();
                }

                stack.push(currentMax);
            }
        }

        return stack.size();
    }
}
