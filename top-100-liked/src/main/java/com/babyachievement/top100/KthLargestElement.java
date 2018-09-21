/**
 * date: 2018/9/20 18:15
 */

package com.babyachievement.top100;

public class KthLargestElement {
    void findKthBigger(int[] a, int K, int m, int n) {
        int i    = m, j = n;
        int base = a[i];
        while (i < j) {
            while (i < j && a[j] < base) {
                --j;
            }
            if (i < j)
                a[i++] = a[j];
            while (i < j && a[i] >= base) {
                ++i;
            }
            if (i < j) {
                a[j--] = a[i];
            }
        }
        a[i] = base;
        if (K - 1 > i) {
            findKthBigger(a, K, i + 1, n);
        }
        if (K - 1 < i) {
            findKthBigger(a, K, m, i - 1);
        } else
            return;
    }

    public int findKthLargest(int[] nums, int k) {
        findKthBigger(nums, k, 0, nums.length-1);
        return nums[k - 1];
    }
}
