/**
 * date: 2019/7/17 14:19
 */

public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1, mid;

        while (low <= high) {
            if (low == high) return nums[low] == target ? low : -1;

            mid = (low + high) / 2;

            final int midValue = nums[mid];
            if (midValue == target) {
                return mid;
            }


            //                    Max
            // low     mid        high
            if (nums[low] < nums[high]) {
                if (midValue < target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            } else {
                if (midValue > nums[high]) {
                    //                    Max
                    // low           mid         high
                    if (target < midValue && target>=nums[low]) {
                        high = mid - 1;
                    } else {
                        low = mid + 1;
                    }
                } else {
                    //          Max
                    // low            mid         high
                    if (target > midValue && target <= nums[high]) {
                        low = mid + 1;
                    } else {
                        high = mid - 1;
                    }
                }
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        final SearchInRotatedSortedArray searchInRotatedSortedArray = new SearchInRotatedSortedArray();
        System.out.println(searchInRotatedSortedArray.search(new int[]{4, 5, 6, 7, 8, 1, 2, 3},
                                                             8));
    }
}
