package com.babyachievement.top.interviews;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/house-robber-ii/description/
 */
public class HouseRobberII213 {
    public int rob(int[] nums) {
        int[][] dp = new int[nums.length][nums.length];

        for (int i = 0; i < nums.length; i++) {
            Arrays.fill(dp[i], Integer.MIN_VALUE);
        }
        for (int i = 0; i < nums.length; i++) {
            dp[i][i] = nums[i];
        }

        return max(nums, 0, nums.length - 1, dp);
    }

    public int max(int[] nums, int start, int end, int[][] dp) {
        if (start > end) {
            return 0;
        }
        if (start == end) {
            return nums[start];
        }

        if (dp[start][end] >= 0) {
            return dp[start][end];
        }

        int max = 0;
        int withCurrent = 0;
        int withoutCurrent = 0;
        for (int i = start; i <= end; i++) {
            if (i > 0) {
                withCurrent = nums[i] + max(nums, i + 2, end, dp);
            } else {
                withCurrent = nums[i] + max(nums, i + 2, end - 1, dp);
            }
            withoutCurrent = max(nums, i + 1, end, dp);
            max = Math.max(max, Math.max(withCurrent, withoutCurrent));
        }

        dp[start][end] = max;
        return max;
    }




    public int rob2(int[] nums) {
        int n = nums.length;

        if(nums.length == 0 || nums == null){
            return 0;
        }

        if(nums.length == 1){
            return nums[0];
        }

        int[] dp = new int[n - 1];

        int res = Integer.MIN_VALUE;

        for(int i = 0 ; i < n - 1; i++){
            dp[i] = nums[i];
        }

        res = Math.max(res, calc(dp));

        for(int i = 0 ; i < n - 1; i++){
            dp[i] = nums[i + 1];
        }
        res = Math.max(res, calc(dp));
        return res;
    }

    public int calc(int[] A){
        if(A == null || A.length == 0){
            return 0;
        }

        if(A.length == 1)
            return A[0];

        int[] dp = new int[A.length + 1];
        dp[0] = 0;
        dp[1] = A[0];
        dp[2] = Math.max(A[0], A[1]);
        for(int i = 3; i <= A.length; i++){
            dp[i] = Math.max(dp[i - 1], dp[i -2] + A[i - 1]);
        }

        return dp[A.length];
    }
}
