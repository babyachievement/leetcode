package com.babyachievement.top.interviews;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * date: 2018/10/23 10:06
 */
public class PascalsTriangle118Test {

    @Test
    public void generate() {
        final PascalsTriangle118 pascalsTriangle118 = new PascalsTriangle118();
        System.out.println(pascalsTriangle118.generate(1));
        System.out.println(pascalsTriangle118.generate(2));
        System.out.println(pascalsTriangle118.generate(3));
        System.out.println(pascalsTriangle118.generate(4));
        System.out.println(pascalsTriangle118.generate(5));
        System.out.println(pascalsTriangle118.generate(6));
    }
}