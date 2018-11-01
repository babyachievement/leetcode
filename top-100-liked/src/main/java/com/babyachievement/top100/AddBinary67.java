package com.babyachievement.top100;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/add-binary/description/
 */
public class AddBinary67 {
    public String addBinary(String a, String b) {
        if (a == null || a.isEmpty()) {
            return b;
        }

        if (b == null || b.isEmpty()) {
            return a;
        }

        int i = a.length() - 1;
        int j = b.length() - 1;

        // TODO
        return null;
    }
}
