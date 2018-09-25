package com.babyachievement.top100;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * date: 2018/9/25 10:24
 */
public class ProductOfArrayExceptSelf238Test {

    @Test
    public void productExceptSelf() {
        final ProductOfArrayExceptSelf238 product = new ProductOfArrayExceptSelf238();
        final int[] result = product.productExceptSelf(
                new int[]{1, 2, 3, 4});
        assertArrayEquals(result, new int[]{24, 12, 8, 6});

    }

}