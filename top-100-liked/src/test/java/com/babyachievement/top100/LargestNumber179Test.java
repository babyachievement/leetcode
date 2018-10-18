package com.babyachievement.top100;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * date: 2018/10/18 13:59
 */
public class LargestNumber179Test {

    @Test
    public void largestNumber() {
        final LargestNumber179 largestNumber179 = new LargestNumber179();
        assertThat(largestNumber179.largestNumber(new int[]{3, 30, 34, 5, 9}),
                   is("9534330"));
        assertThat(largestNumber179.largestNumber(new int[]{10, 2}), is("210"));
        assertThat(largestNumber179.largestNumber(new int[]{128, 12}), is("12812"));
        assertThat(largestNumber179.largestNumber(new int[]{12, 128}), is("12812"));
        assertThat(largestNumber179.largestNumber(new int[]{121, 12}), is("12121"));
        assertThat(largestNumber179.largestNumber(new int[]{0, 0}), is("0"));
//        assertThat(largestNumber179.largestNumber(new int[]{824,938,1399,5607,6973,5703,9609,4398,8247}), is("9609938824824769735703560743981399"));
        assertThat(largestNumber179.largestNumber(new int[]{824,8247}), is("8248247"));
        assertThat(largestNumber179.largestNumber(new int[]{1440,7548,4240,6616,733,4712,883,8,9576}), is("9576888375487336616471242401440"));
    }
}