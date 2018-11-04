/**
 * date: 2018/10/11 15:13
 */

package com.babyachievement.top100;

import java.util.*;

/**
 * https://leetcode.com/problems/reorganize-string/description/
 * @see TaskScheduler621
 */
public class ReorganizeString767 {
    public String reorganizeString(String S) {
        // Important
        char ch[] = new char[26];
        int max = 0;
        for(char c: S.toCharArray()) {
            ch[c - 'a'] ++;
            if(ch[c-'a'] > ch[max]) max = c - 'a';
        }
        int len = S.length();
        if(len < 2 * ch[max] - 1) return "";
        int index = 0;
        char []res = new char[len];
        for(int i = 0 ; i < ch[max]; i++) {
            res[index] = (char)(max + 'a');
            index += 2;
        }
        ch[max] = 0;
        for(int i = 0 ; i < 26; i++) {
            int count = ch[i];
            while(count > 0 ) {
                if(index >= len ) index = 1;
                res[index] = (char)(i + 'a');
                index += 2;
                count --;
            }
        }

        return new String(res);
    }
}
