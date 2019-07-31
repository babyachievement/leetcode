/**
 * date: 2019/7/31 17:32
 */

public class MaxChunksToMakeSorted769 {
    public int maxChunksToSorted(int[] arr) {
        int count = 0;
        // 使用一个单调递减栈

        int            next   = arr.length - 1;
        int currentMin = Integer.MAX_VALUE;
        int size = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            currentMin = Math.min(currentMin, arr[i]);

            if (size == next - currentMin) {
                count++;
                size = 0;
                next = currentMin - 1;
                currentMin = next;
            }else {
                size++;
            }

        }

        return count;

    }

    public static void main(String[] args) {
        final MaxChunksToMakeSorted769 maxChunksToMakeSorted769 = new MaxChunksToMakeSorted769();
        System.out.println(maxChunksToMakeSorted769.maxChunksToSorted(new int[]{0, 2, 1}));
        System.out.println(maxChunksToMakeSorted769.maxChunksToSorted(new int[]{0, 4, 2, 3, 1}));
        System.out.println(maxChunksToMakeSorted769.maxChunksToSorted(new int[]{1, 4, 3, 6, 0, 7, 8, 2, 5}));
        System.out.println(maxChunksToMakeSorted769.maxChunksToSorted(new int[]{1,2,0,3}));
        System.out.println(maxChunksToMakeSorted769.maxChunksToSorted(new int[]{0,4,5,2,1,3}));
    }
}
