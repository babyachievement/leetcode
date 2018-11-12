package com.babyachievement;

import java.util.LinkedList;

/**
 * https://leetcode.com/problems/simplify-path/description/
 */
public class SimplifyPath71 {
    public String simplifyPath(String path) {

        LinkedList<String> list  = new LinkedList<>();
        String[]           names = path.split("/");
        for (int i = 0; i < names.length; i++) {
            if ("".equals(names[i]) || ".".equals(names[i])) {
                continue;
            }
            if ("..".equals(names[i])) {
                if (!list.isEmpty()) {
                    list.pollLast();
                }
            } else {
                list.addLast(names[i]);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("/");

        int i = 0;
        for (String s : list) {
            sb.append(s);
            if (i != list.size() - 1) {
                sb.append("/");
            }
            i++;
        }

        return sb.toString();
    }
}
