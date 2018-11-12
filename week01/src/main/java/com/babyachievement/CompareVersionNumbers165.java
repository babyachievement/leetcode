package com.babyachievement;

/**
 * https://leetcode.com/problems/compare-version-numbers/description/
 */
public class CompareVersionNumbers165 {
    public int compareVersion(String version1, String version2) {
        int len1 = version1.length();
        int len2 = version2.length();


        int i = 0;
        int j = 0;
        while (i < len1 && j < len2) {
            int i1 = version1.indexOf('.', i);
            int i2 = version2.indexOf('.', j);

            if (i1 < 0) {
                i1 = len1;
            }

            if (i2 < 0) {
                i2 = len2;
            }

            int v1 = Integer.parseInt(version1.substring(i, i1));
            int v2 = Integer.parseInt(version2.substring(j, i2));
            if (v1 == v2) {
                i = i1 + 1;
                j = i2 + 1;
                continue;
            }

            return v1 > v2 ? 1 : -1;
        }

        int sum1 = 0;
        int index = 0;
        if (i < len1) {
            while ((index = version1.indexOf('.', i)) > 0) {
                sum1 = 10 * sum1 + Integer.parseInt(version1.substring(i, index));
                i = index + 1;
            }

            if (i < len1) {
                sum1 += Integer.parseInt(version1.substring(i, len1));
            }
            if (sum1 > 0) {
                return 1;
            }
        }

        if (j < len2) {
            sum1 = 0;
            while ((index = version2.indexOf('.', j)) > 0) {
                sum1 = 10 * sum1 + Integer.parseInt(version2.substring(j, len2));
                j = index + 1;
            }

            if (j < len2) {
                sum1 += Integer.parseInt(version2.substring(j, len2));
            }
            if (sum1 > 0) {
                return -1;
            }
        }

        return 0;
    }
}
