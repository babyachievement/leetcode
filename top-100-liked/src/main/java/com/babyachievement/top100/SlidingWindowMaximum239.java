/**
 * date: 2018/9/25 18:15
 */

package com.babyachievement.top100;

import java.util.LinkedList;

/**
 * https://leetcode.com/problems/sliding-window-maximum/description/
 */
public class SlidingWindowMaximum239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return nums;
        }
        final int   slidings = nums.length - k + 1;
        final int[] result   = new int[slidings];
        int         ri       = 0;

        final LinkedList<Integer> maximum = new LinkedList<>();

        for (int i = 0; i < nums.length; i++) {
            // remove numbers out of range k
            while (!maximum.isEmpty() && maximum.peekFirst() < i - k + 1) {
                maximum.poll();
            }
            // remove smaller numbers in k range as they are useless
            while (!maximum.isEmpty() && nums[maximum.peekLast()] < nums[i]) {
                maximum.pollLast();
            }
            // q contains index... r contains content
            maximum.offer(i);
            if (i >= k - 1) {
                result[ri++] = nums[maximum.peek()];
            }
        }

        //
        return result;
    }


    public int[] maxSlidingWindow2(int[] nums, int k) {

        if(k <= 0 || nums.length < k) return new int[0];

        int [] ret = new int[nums.length-k+1];

        for(int i = 0; i < ret.length; ++i){

            ret[i] = Integer.MIN_VALUE;

        }

        for(int i = 0; i < k; ++i){

            if(ret[0] < nums[i]) ret[0] = nums[i];

        }

        for(int i = 1; i < ret.length; ++i){

            if(nums[i+k-1] > ret[i-1]){

                ret[i] = nums[i+k-1];

            }else if(nums[i-1] < ret[i-1]){

                ret[i] = ret[i-1];

            }else{

                for(int j = i; j < i+k; ++j){

                    if(ret[i] < nums[j]) ret[i] = nums[j];

                }

            }

        }

        return ret;
    }
}
