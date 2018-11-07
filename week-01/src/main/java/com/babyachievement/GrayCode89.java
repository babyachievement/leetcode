package com.babyachievement;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * https://leetcode.com/problems/gray-code/description/
 */
public class GrayCode89 {
    public List<Integer> grayCode(int n) {
        Set<Integer> contained = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        result.add(0);
        contained.add(0);
        grayCodes(n, 0, contained, result);
        return result;
    }

    public boolean grayCodes(int n, int current, Set<Integer> contained, List<Integer> result) {

        if (result.size() == (1 << n)) {
            return true;
        }

        for (int i = 1; i <= n; i++) {
            int newI = diffInt(i, current);
            if (!contained.contains(newI)) {
                contained.add(newI);
                result.add(newI);
                if (grayCodes(n, newI, contained, result)) {
                    return true;
                }
                contained.remove(newI);
                result.remove(result.size() - 1);
            }
        }

        return false;

    }

    int diffInt(int i, int current) {
        return current ^ (1 << (i - 1));
    }

    /**
     * for example you have the answer for n = 2 as (00, 01, 11, 10), how you can get the answer for n = 3?
     (1) you need all the answer in n = 2, copy them (000, 001, 011, 010);
     (2) add pow(2,2) = 4 to all the answer in n = 2 as in (1) and add them to n = 3, BUT! start from the last one, that is (110, 111, 101, 100)!!!

     Why this work?
     (1) the answer in n = 2 is valid, (0-3 valid)
     (2) since we start from the last one, that is "10", we add 4 to it, it become "110", still valid, (3-4 valid)
     (3) since we add 4 to all answer in n = 2; they are still one bit different from each other, then also valid! (4-7 valid)
     * @param n
     * @return
     */
    public List<Integer> grayCode2(int n) {
        List<Integer> gray_code = new ArrayList<>();
        gray_code.add(0);
        for(int i = 0; i < n; i++) {
            int size = gray_code.size();
            for(int j = size - 1; j >= 0; j--) {
                gray_code.add(gray_code.get(j) | 1 << i);
            }
        }
        return gray_code;
    }
}
