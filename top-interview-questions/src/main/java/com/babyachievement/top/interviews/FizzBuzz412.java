/**
 * date: 2018/10/30 18:04
 */

package com.babyachievement.top.interviews;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/fizz-buzz/description/
 */
public class FizzBuzz412 {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i%5==0) {
                result.add("FizzBuzz");
            }
            else if (i % 3 == 0) {
                result.add("Fizz");
            }
            else if (i % 5 == 0) {
                result.add("Buzz");
            }else {
                result.add(String.valueOf(i));
            }
        }

        return result;
    }
}
