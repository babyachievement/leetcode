/**
 * date: 2018/9/17 10:00
 */
package com.babyachievement.top100;

/**
 * https://leetcode.com/problems/median-of-two-sorted-arrays/description/
 */
public class MedianOfTwoSortedArrays {
    /**
     * 在两个有序数组中查找中位数
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int foundedCount = (nums1.length + nums2.length) % 2 == 0 ? 2 : 1;
        int sum          = 0;

        int num1CurrentIndex = 0;
        int num2CurrentIndex = 0;
        int totalSize        = (nums1.length + nums2.length);
        int firstIndex       = totalSize % 2 == 0 ? totalSize / 2 : totalSize / 2 + 1;

        while (num1CurrentIndex < nums1.length && num2CurrentIndex <
                nums2.length) {

            if (nums1[num1CurrentIndex] < nums2[num2CurrentIndex]) {
                firstIndex--;
                if (firstIndex == 0) {
                    sum += nums1[num1CurrentIndex];
                    num1CurrentIndex++;
                    break;
                }
                num1CurrentIndex++;

            } else {
                firstIndex--;
                if (firstIndex == 0) {
                    sum += nums2[num2CurrentIndex];
                    num2CurrentIndex++;
                    break;
                }
                num2CurrentIndex++;

            }
        }

        if (firstIndex != 0) {
            if (num1CurrentIndex == nums1.length) {
                sum += nums2[num2CurrentIndex + firstIndex - 1];
                num2CurrentIndex+= firstIndex;
            }else {
                sum += nums1[num1CurrentIndex + firstIndex - 1];
                num1CurrentIndex+= firstIndex;
            }

        }


        if (foundedCount == 2) {
            if (num1CurrentIndex == nums1.length || nums1.length==0) {
                sum += nums2[num2CurrentIndex];
            } else if (num2CurrentIndex == nums2.length || nums2.length==0) {
                sum += nums1[num1CurrentIndex];
            } else {
                sum += nums1[num1CurrentIndex] >
                        nums2[num2CurrentIndex] ? nums2[num2CurrentIndex] : nums1[num1CurrentIndex];
            }
        }


        return sum* 1.0 / foundedCount ;
    }


    public double findMedianSortedArrays2(int[] nums1, int[] nums2) {

        int n = nums1.length ;
        int m = nums2.length ;
        int l = (n + m + 1)/2;
        int r = (m + n + 2)/2;
        return (help(nums1, 0, nums2, 0, l) + help(nums1, 0, nums2, 0, r)) / 2.0;
    }
    public double help (int [] nums1, int starta, int [] nums2, int startb, int k) {
        if (starta > nums1.length - 1) return nums2[startb + k - 1];
        if (startb > nums2.length - 1) return nums1[starta + k - 1];
        if (k == 1) return Math.min(nums1[starta], nums2[startb]);
        int aMid = Integer.MAX_VALUE, bMid = Integer.MAX_VALUE;
        if (starta + k/2 <= nums1.length) aMid = nums1[starta + k/2 - 1];
        if (startb + k/2 <= nums2.length) bMid = nums2[startb + k/2 - 1];
        if (aMid < bMid) return help(nums1, starta + k/2, nums2, startb, k - k/2);
        else {
            return help(nums1, starta, nums2, startb + k/2, k - k /2);
        }
    }
}
