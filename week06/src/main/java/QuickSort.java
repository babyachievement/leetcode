/**
 * date: 2019/7/24 18:03
 */

public class QuickSort {
    public void sort(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        quickSort(nums, i, j);
    }

    public void quickSort(int[] nums, int left, int right) {
        int p = partition(nums, left, right);

        quickSort(nums, left, p - 1);
        quickSort(nums, p + 1, right);
    }

    private int partition(int[] nums, int left, int right) {
        int i = left;
        int j = right;
        int p = nums[left];
        while (i < j) {
            while (nums[j] > p&&i<j) {
                j--;
            }
            if (i < j) {
                nums[i] = nums[j];
                i++;
            }

            while (nums[i] < p) {
                i++;
            }

            nums[j] = nums[i];
        }

        nums[i] = p;
        return i;
    }

    public static void main(String[] args) {
        final QuickSort quickSort = new QuickSort();
        int[]           nums      = new int[]{2, 8, 7, 1, 3, 5, 6, 4};
        quickSort.sort(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }

}
