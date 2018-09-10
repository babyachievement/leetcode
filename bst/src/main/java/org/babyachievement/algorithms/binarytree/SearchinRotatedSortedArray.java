/**
 * date: 2018/9/10 14:54
 */

package org.babyachievement.algorithms.binarytree;

public class SearchinRotatedSortedArray {
    private int target;
    private int[] nums;

    public int search(int[] nums, int target) {
        this.target = target;
        this.nums = nums;
        return searchWithStartAndEndIndex(0, nums.length - 1);
    }

    public int searchWithStartAndEndIndex(int start, int end) {
        if (start > end) {
            return -1;
        }
        if (start == end) {
            return this.nums[start] == target ? start : -1;
        }

        int mid = (start + end) / 2;

        if (this.nums[mid] == target) {
            return mid;
        }

        // 如果this.nums[start]<this.nums[end], 在this
        // .nums[start]和this.nums[end]之间查找
        if (this.nums[start] < this.nums[end]) {
            return this.nums[mid] > target ?
                    searchWithStartAndEndIndex(start, mid - 1)
                    : searchWithStartAndEndIndex(mid + 1, end);
        } else {
            if (this.nums[mid] >= this.nums[start]) {
                if (this.nums[mid] < target) {
                    return searchWithStartAndEndIndex
                            (mid + 1, end);
                } else if (nums[end] >= target) {
                    return searchWithStartAndEndIndex
                            (mid + 1, end);
                } else {
                    return searchWithStartAndEndIndex(start, mid - 1);
                }
            } else {
                if (this.nums[mid] <= target) {
                    if (target > this.nums[end]) {
                        return searchWithStartAndEndIndex(start, mid - 1);
                    } else {
                        return searchWithStartAndEndIndex(mid + 1, end);
                    }
                } else {
                    // nums[mid] < nums[start] && target < nums[mid]
                    return searchWithStartAndEndIndex(start, mid - 1);

                }
            }
        }
    }

    public int searchWithIterative(int[] nums, int target) {
        /**
         * 异常处理
         */
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int low, high, mid;

        low = 0;
        high = nums.length - 1;

        while (low <= high) {
            if (low == high) {
                return target == nums[low] ? low : -1;
            }

            mid = (low + high) / 2;
            if (nums[mid] == target) {
                return mid;
            }

            // nums[low] < nums[high]
            if (nums[low] <= nums[high]) {
                if (nums[mid] > target) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {

                if (nums[low] <= nums[mid] && nums[mid] < target) {
                    low = mid + 1;
                    continue;
                } else if (target <= nums[high] && nums[low] <= nums[mid]) {
                    low = mid + 1;
                    continue;
                }
                else if(target <=nums[high] && target > nums[mid])
                {
                    low = mid + 1;
                    continue;
                }
                else {
                    high = mid - 1;
                    continue;
                }
            }

        }

        return -1;
    }

}
