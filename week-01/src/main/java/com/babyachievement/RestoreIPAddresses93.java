/**
 * date: 2018/11/8 14:04
 */

package com.babyachievement;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/restore-ip-addresses/description/
 */
public class RestoreIPAddresses93 {

    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        backtrack(s, 0, 0, result, new String[4]);
        return result;
    }

    public void backtrack(String s, int start, int num, List<String> result,
                          String[] str) {
        if (start >= s.length() && num == 4) {
            result.add(str[0]+"."+str[1]+"."+str[2]+"."+str[3]);
            return;
        }

        if (start >= s.length() || num >= 4) {
            return;
        }

        for (int i = start; i <= start + 2 && i<s.length(); i++) {
            final int v = Integer.parseInt(s.substring(start, i + 1));
            if (v >= 0 && v < 256) {
                str[num] = String.valueOf(v);

                backtrack(s, i+1, num+1, result, str);
                if (v == 0) {
                    break;
                }
            }
        }
    }
}
