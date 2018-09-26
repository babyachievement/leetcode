/**
 * date: 2018/9/25 10:24
 */

package com.babyachievement.top100;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/product-of-array-except-self/description/
 */
public class ProductOfArrayExceptSelf238 {
    public int[] productExceptSelf(int[] nums) {
        final int[] product = new int[nums.length];
        Arrays.fill(product, 1);

        for (int i = 1; i < nums.length; i++) {
            product[i] = product[i - 1] * nums[i - 1];
        }

        int right = 1;
        for (int i = nums.length-1; i >=0; i--) {
            product[i] = product[i] * right;
            right = right * nums[i];
        }

        return product;
    }
}
