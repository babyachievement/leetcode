package com.babyachievement.top.interviews;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * date: 2018/11/1 14:51
 */
public class Four4Sum18Test {

    @Test
    public void fourSum() {
        final Four4Sum18 four4Sum18 = new Four4Sum18();
        System.out.println(four4Sum18.fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0));
        System.out.println(four4Sum18.fourSum(new int[]{-3,0,0,3}, 0));
        System.out.println(four4Sum18.fourSum(new int[]{-3,-2,-1,0,0,1,2,3}, 0));
        System.out.println(four4Sum18.fourSum(new int[]{-500,-498,-414,-406,
                                                      -404,-397,-395,-389,
                                                      -349,-274,-253,-249,-238,-222,-215,-201,-171,-159,-157,-156,-156,-110,-89,-80,-76,-75,-70,-52,-9,-2,1,8,40,52,58,60,98,116,143,148,151,165,165,219,236,244,259,285,292,318,319,331,337,347,360,363,365,430,443,444,470,472}, 6111));
    }
}