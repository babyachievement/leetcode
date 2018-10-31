package com.babyachievement.top100;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * date: 2018/10/31 18:01
 */
public class SumofTwoIntegers371Test {

    @Test
    public void getSum() {
        final SumofTwoIntegers371 sumofTwoIntegers371 = new SumofTwoIntegers371();
//        assertThat(sumofTwoIntegers371.getSum(1, 2), is(3));
        assertThat(sumofTwoIntegers371.getSum(1, 3), is(4));
//        assertThat(sumofTwoIntegers371.getSum(-1, 2), is(1));
    }
}