package com.babyachievement.solutions_50;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;


/**
 * FileName:MyPowerTest
 * Created by HaoQiang
 * Date:17-7-31
 * Time:下午11:32
 */
public class MyPowerTest {
    @Test
    public void myPow() throws Exception {
        MyPower myPower = new MyPower();
        double v = myPower.myPow(5, 2);
        assertThat(v, closeTo(25, 0.1));
        v = myPower.myPow(34.00515, -3);
        System.out.println(v);
        assertThat(v, closeTo(0.00003, 0.00001));
        v = myPower.myPow(0.00001, 2147483647);
        System.out.println(v);
        v = myPower.myPow(1.0, 2147483647);
        System.out.println(v);
    }

}