/**
 * date: 2018/10/18 13:58
 */

package com.babyachievement.top100;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * https://leetcode.com/problems/largest-number/description/
 */
public class LargestNumber179 {

    public String largestNumber(int[] nums) {
        final StringBuilder strB   = new StringBuilder();
        List<String>        numStr = new ArrayList<>();
        for (int num : nums) {
            numStr.add(String.valueOf(num));
        }

        Collections.sort(numStr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return LargestNumber179.this.compare(o2, 0, o1, 0);
            }
        });

        if ("0".equals(numStr.get(0))) {
            return "0";
        }
        for (String s : numStr) {
            strB.append(s);
        }

        return strB.toString();
    }

    public int compare(String num1, int i, String num2, int j) {
        char[] array1 = num1.toCharArray();
        char[] array2 = num2.toCharArray();
        while (i < array1.length && j < array2.length) {
            if (array1[i] != array2[j])
                return array1[i] - array2[j];
            i++;
            j++;
        }

        if (i == array1.length && j == array2.length)
            return 0;
        else if (i == array1.length) {
            return compare(num1, 0, num2, j);
        } else {
            return compare(num1, i, num2, 0);
        }
    }
}
