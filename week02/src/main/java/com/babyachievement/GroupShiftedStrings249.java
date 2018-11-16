/**
 * date: 2018/11/15 17:16
 */

package com.babyachievement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * https://www.programcreek.com/2014/05/leetcode-group-shifted-strings-java/
 */
public class GroupShiftedStrings249 {
    public List<List<String>> groupStrings(String[] strs) {
        HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
        for (String s : strs) {
            String key = "";
            for (int i = 1; i < s.length(); i++)
                key += String.format("%2d",
                                     (s.charAt(i) - s.charAt(i - 1) + 26) % 26);//Difference from the previous char.
            if (!map.containsKey(key)) map.put(key, new ArrayList<String>());
            map.get(key).add(s);
        }
        return new ArrayList<List<String>>(map.values());

    }
}
