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

        char[] t = new char[Math.max(a.length(), b.length()) + 1];

        int i = a.length() - 1;
        int j = b.length() - 1;
        int k = t.length - 1;

        int carry = 0;
        while (i >= 0 && j >= 0) {
            t[k--] = (char) (((a.charAt(i) - '0') ^ (b.charAt(j) - '0') ^ carry) + '0');
            carry = ((a.charAt(i) - '0') + (b.charAt(j) - '0') + carry) > 1 ? 1 : 0;
            i--;
            j--;
        }

        while (i >= 0) {
            t[k--] = (char) (((a.charAt(i) - '0') ^ carry) + '0');
            carry = carry & (a.charAt(i) - '0');
            i--;
        }

        while (j >= 0) {
            t[k--] = (char) (((b.charAt(j) - '0') ^ carry) + '0');
            carry = carry & (b.charAt(j) - '0');
            j--;
        }

        if(carry>0) {
            t[k] = '1';
            k--;
        }

        return String.valueOf(t, k+1, t.length - k -1);
    }
}
